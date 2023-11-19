import Link from "next/link";
import DashboardLayout from "../../components/Layouts/DashboardLayout";
import TopCard from "./components/TopCard";
import Header from "@/components/Header";
import { IoIosAddCircleOutline } from "react-icons/io";
import DataTable from "./components/DataTable";
import PieChart from "./components/PieChat";
import { topCard_items, header, hospitals, statusOptions } from "./lib/data";
export default function Dashboard() {
  const Items = topCard_items;

  return (
    <div className="bg-background dark:bg-background min-h-screen">
      <Header />
      <div className="grid lg:grid-cols-3 p-4 gap-2 rounded-lg">
        {topCard_items.map((item, index) => (
          <TopCard Items={item} key={index} />
        ))}
      </div>

      <div className="pr-4">
        <div className="flex gap-x-4 justify-end">
          <button
            type="button"
            className="text-white bg-primary hover:ring dark:bg-primary dark:hover:ring duration-200 font-sm rounded-lg text-sm my-2 p-2"
          >
            <Link
              href={{
                pathname: "/dashboard/pages/medicalplan",
              }}
            >
              <div className="inline-flex">
                <IoIosAddCircleOutline className="my-1 mr-2" />
                <span>Add Medical Plan</span>
              </div>
            </Link>
          </button>

          <button
            type="button"
            className="text-white bg-primary hover:ring dark:bg-primary dark:hover:ring duration-200 font-sm rounded-lg text-sm my-2 p-2"
          >
            <Link
              href={{
                pathname: "/dashboard/pages/cluster",
              }}
            >
              <div className="inline-flex">
                <IoIosAddCircleOutline className="my-1 mr-2" />
                <span>Add Cluster</span>
              </div>
            </Link>
          </button>
          
          <button
            type="button"
            className="text-white bg-primary hover:ring dark:bg-primary dark:hover:ring duration-200 font-sm rounded-lg text-sm my-2 p-2"
          >
            <Link
              href={{
                pathname: "/dashboard/pages/health_resource",
              }}
            >
              <div className="inline-flex">
                <IoIosAddCircleOutline className="my-1 mr-2" />
                <span>Add Health Resource</span>
              </div>
            </Link>
          </button>
        </div>
      </div>

      <div className="grid lg:grid-cols-3 p-4 lg:gap-x-4 sm:gap-y-4">
        <div className="col-span-2">
          <DataTable title="Facility List" columns={header} rows={hospitals} status={statusOptions}/>
        </div>
        <div className="col-span-1">
          <PieChart/>
        </div>
      </div>
    </div>
  );
}

Dashboard.getLayout = function getLayout(page) {
  return <DashboardLayout>{page}</DashboardLayout>;
}
