import DashboardLayout from "../../components/Layouts/DashboardLayout"

export default function Dashboard() {
    return (
        <div>
            Dashboard
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