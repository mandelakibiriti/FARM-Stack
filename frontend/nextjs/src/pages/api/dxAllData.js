export async function getAllDxHandler() {
    let server_url = process.env.NEXT_GET_ALL_DXs
    // console.log(server_url)
    // Fetch data from external API
    // ISR with revalidate
    const res = await fetch(server_url, {
        next : {
            revalidate: 60
        }
    })
    if (!res.ok) {
        // This will activate the closest `error.js` Error Boundary
        console.log('Failed to fetch data');
        return {
            notFound: true
        }
    }
    let data = await res.json()
    console.log("Data Aquired Success!")
    return { 
        props: data
    }
}