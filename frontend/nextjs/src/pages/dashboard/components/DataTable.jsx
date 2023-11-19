import { 
    Card, Title, Table, TableHead, TableHeaderCell, Button,
    TableBody, TableRow, TableCell, Text, Divider, Badge, Icon
} from "@tremor/react";
import { ArrowNarrowRightIcon } from "@heroicons/react/solid";
import { OfficeBuildingIcon } from "@heroicons/react/outline";


export default function DataTable(props) {
    return (
        <Card className="drop-shadow-lg" decoration="top">
            <div className="flex gap-x-4">
                <Icon variant="light" icon={OfficeBuildingIcon} size="lg" color="blue" />
                <Title className="mt-2">{props.title}</Title>
            </div>

            <Divider className="dark:bg-primary-foreground"/>
            <Table className="mt-2">
                <TableHead>
                    <TableRow>
                    {
                        props.columns.filter((el, i) => (i < 5)).map((item, index)=>
                        <TableHeaderCell className="text-slate-900 dark:text-primary-foreground" key={index}>{item.name}</TableHeaderCell>
                    )}
                    </TableRow>
                </TableHead>
                <TableBody>
                    {
                        props.rows.filter((el,i) => (i < 5)).map((item,index)=>(
                            <TableRow key={index}>
                                <TableCell>
                                    <Text className="dark:text-primary-foreground">{item.hospital_id}</Text>
                                </TableCell>
                                <TableCell>
                                    <Text className="dark:text-primary-foreground">{item.name}</Text>
                                </TableCell>
                                <TableCell>
                                    <Text className="dark:text-primary-foreground">{item.cluster_code}</Text>
                                </TableCell>
                                <TableCell>
                                    <Text className="dark:text-primary-foreground">{item.city}</Text>
                                </TableCell>
                                <TableCell>
                                    <Badge className={`
                                    ${item.status == "active" && "bg-green-400 text-white dark:bg-green-400 dark:text-slate-900"}
                                    ${item.status == "inactive" && "bg-red-400 text-white dark:bg-red-400 dark:text-slate-900"}
                                    `}>{item.status}</Badge>
                                </TableCell>
                            </TableRow>
                        ))
                    }
                </TableBody>
            </Table>
                <Button
                size="sm"
                variant="light"
                icon={ArrowNarrowRightIcon}
                iconPosition="right"
                className="mt-2 hover:translate-x-4 duration-500"
                >
                    View details
                </Button>  
        </Card>
    );
}
