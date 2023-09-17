import Link from "next/link";
import { useState, useMemo, useEffect } from "react";
import { IoIosAddCircleOutline} from "react-icons/io";
import { BsFillPencilFill } from "react-icons/bs";
import { MdDelete } from "react-icons/md";
import { ClipboardListIcon } from "@heroicons/react/outline";
import { Title, Icon, Divider } from "@tremor/react";
import { 
    Chip, cn, Button,
    Table, TableHeader, TableColumn, TableBody, TableRow, TableCell,
    DropdownTrigger, Dropdown, DropdownMenu, DropdownSection, DropdownItem } from "@nextui-org/react";
import DeleteModal from "@/pages/diseaseList/components/DeleteModal";
import { VerticalDotsIcon } from "./VerticalDots";

export default function DiseaseList({dxData}) {
    // Delete Modal
    const [ showDeleteModal, setShowDeleteModal ] = useState(false);
    const [ modalData, setModalData ] = useState(null);
    const closeModalHandler = () => {
        setShowDeleteModal(false);
    }

    // Search items in list
    const [ search, setSearch ] = useState('')
    // set the value of our useState query anytime the user types on our input
    const handleChange = (e) => {
        setSearch(e.target.value)
    }

    // Icons in Dropdown
    const iconClasses = "text-xl text-default-500 pointer-events-none flex-shrink-0";

    // Sort
    const [sortDescriptor, setSortDescriptor] = useState({
        //indicate json key from data
        direction: "ascending"
      });
    const sortedItems = useMemo(() => {
        return dxData.sort((a, b) => {
            const first = a["publish"];
            const second = b["publish"];
            const cmp = first < second ? -1 : first > second ? 1 : 0;
            return sortDescriptor.direction === "descending" ? -cmp : cmp;
        });
    },[sortDescriptor, dxData]);

    return (
        <div>
            <div className="gap-4 p-4">
                <div className="flex">
                    <div className="text-primary font-medium text-sm px-2 py-4">
                        <svg aria-hidden="true" className="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
                        <span className="sr-only">Search</span>
                    </div>
                    <input onChange={handleChange} type="search" id="default-search" className="block w-full p-4 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:outline-none focus:ring-blue-500 focus:border-blue-500" placeholder="Search by diagnosis name">
                    </input>
                </div>
            </div>
            <div className="m-4 w-1/1">
                <div className="flex justify-between">
                    <div className="flex gap-x-2">
                    <Icon icon={ClipboardListIcon} size="lg" color="blue"/>
                    <Title className="mt-2">Number of Diagnoses</Title>
                    <Chip variant="solid" className="mt-2">
                        <span>{dxData.length}</span>
                    </Chip>
                    </div>
                    <Button className="text-white item-right bg-primary hover:ring dark:bg-primary dark:hover:ring duration-200 rounded-lg text-sm ml-2 p-2">       
                        <Link href={{
                            pathname:'/diseaseList/pages/addDisease' // Add Diagnosis URL
                        }}>
                            <div className="inline-flex">
                                <IoIosAddCircleOutline className="my-1 mr-1"/>
                                <span>Add Diagnosis</span>
                            </div>
                        </Link>
                    </Button>
                </div>
                <Divider className="bg-primary"/>

                <Table  
                    aria-label="Diagnosis Table"
                    sortDescriptor={sortDescriptor}
                    onSortChange={setSortDescriptor}
                >
                    <TableHeader>
                        <TableColumn className="text-slate-900 dark:text-primary-foreground" allowsSorting>DISEASE NAME</TableColumn>
                        <TableColumn className="text-slate-900 dark:text-primary-foreground">ICD CODE</TableColumn>
                        <TableColumn className="text-slate-900 dark:text-primary-foreground">CATEGORY</TableColumn>
                        <TableColumn className="text-slate-900 dark:text-primary-foreground" allowsSorting>STATUS</TableColumn>
                        <TableColumn className="text-slate-900 dark:text-primary-foreground">ACTION</TableColumn>
                    </TableHeader>
                    <TableBody emptyContent={"No Diagnoses found"} dxData={sortedItems}>
                        { 
                            dxData.filter((item) => {// Search Function
                                return search === '' ? item : item.nameStd.toLowerCase().includes(search.toLowerCase())
                            }).map((dx) => (  
                            <TableRow key={dx._id}>     
                                <TableCell>
                                    <span className="dark:text-primary-foreground">{dx.nameStd}</span>
                                </TableCell>
                                <TableCell>
                                    <span className="dark:text-primary-foreground">{dx.icd10}</span>
                                </TableCell> 
                                <TableCell>
                                    <span className="dark:text-primary-foreground">{dx.diseaseClass}</span>
                                </TableCell>    
                                <TableCell>  
                                    {
                                        dx.publish ?
                                        <span className="inline-flex items-center bg-green-100 text-green-800 text-xs font-medium mr-2 px-2.5 py-1 rounded-full">
                                            <span className="w-2 h-2 mr-1 bg-green-500 rounded-full"></span>
                                            Published
                                            <span className="sr-only">Published</span>
                                        </span>
                                        :
                                        <span className="inline-flex items-center bg-yellow-100 text-yellow-600 text-xs font-medium mr-2 px-2.5 py-1 rounded-full">
                                            <span className="w-2 h-2 mr-1 bg-yellow-500 rounded-full"></span>
                                            Draft
                                            <span className="sr-only">Draft</span>
                                        </span>
                                    }
                                </TableCell> 
                                <TableCell>
                                    <div>
                                        <Dropdown
                                            showArrow
                                        >
                                            <DropdownTrigger>
                                                <Button isIconOnly size="sm" variant="light"> 
                                                    <VerticalDotsIcon/>
                                                </Button>
                                            </DropdownTrigger>
                                            <DropdownMenu variant="faded" aria-label="Dropdown menu with icons">
                                            <DropdownSection showDivider>
                                                <DropdownItem
                                                    key="edit"
                                                    description="Allows you to edit or view diagnosis"
                                                    startContent={<BsFillPencilFill className={iconClasses}/>}
                                                >
                                                    <Link href={{
                                                            pathname: `/diseaseList/pages/updateDisease/${dx._id}`,
                                                            query: encodeURI(dx) // Update Diagnosis URL
                                                    }}>
                                                        Edit Diagnosis
                                                    </Link>
                                                </DropdownItem>
                                            </DropdownSection> 
                                            <DropdownSection title="Danger Zone">
                                                <DropdownItem
                                                    key="delete"
                                                    className="text-danger"
                                                    color="danger"
                                                    description="Permanently Delete Diagnosis"
                                                    startContent={<MdDelete className={cn(iconClasses, "text-danger")}/>}
                                                    onClick={() => {
                                                        setShowDeleteModal(true);
                                                        setModalData(dx);
                                                    }}
                                                >
                                                    Delete Diagnosis
                                                </DropdownItem> 
                                            </DropdownSection>
                                            </DropdownMenu>
                                        </Dropdown>
                                    </div>
                            </TableCell>
                            </TableRow> 
                        ))
                    }
                </TableBody> 
                </Table>
            </div>
            <DeleteModal 
                closeModal={closeModalHandler} 
                openModal={showDeleteModal} 
                data={modalData}
            />
        </div>
    )
}