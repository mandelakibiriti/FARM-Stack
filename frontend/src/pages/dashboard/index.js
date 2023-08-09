import DashboardLayout from "../../components/Layouts/DashboardLayout"

export default function Dashboard() {
    return (
        <div className="p-5">
            <span>Dashboard Page</span>
        </div>
    )
}

Dashboard.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}