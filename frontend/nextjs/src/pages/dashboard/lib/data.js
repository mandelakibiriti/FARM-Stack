const header = [
  { name: "ID", uid: "id", sortable: true },
  { name: "NAME", uid: "name", sortable: true },
  { name: "CLUSTER ID", uid: "cluster", sortable: true },
  { name: "LOCATION", uid: "location", sortable: true },
  { name: "STATUS", uid: "status", sortable: true },
  { name: "CITY", uid: "city" }
];

const statusOptions = [
  { name: "Active", uid: "active" },
  { name: "Paused", uid: "paused" },
  { name: "Inactive", uid: "inactive" },
];

const hospitals = [
  {
    hospital_id: "1",
    hospital_org_id: "1",
    ein: "630307951",
    name: "Mizell Memorial Hospital",
    name_cr: "Mizell Memorial Hospital",
    street_address: "702 Main Street",
    city: "Opp",
    state: "AL",
    cluster_code: "36462",
    fips_state_and_county_code: "01039",
    hospital_bed_count: "99",
    chrch_affl_f: "N",
    urban_location_f: "N",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010007",
    county: "Covington County",
    hospital_bed_size: "<100 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "inactive"
  },
  {
    hospital_id: "2",
    hospital_org_id: "2",
    ein: "630578923",
    name: "St Vincents East",
    name_cr: "St Vincents East",
    street_address: "50 Medical Park Drive East",
    city: "Birmingham",
    state: "AL",
    cluster_code: "35235",
    fips_state_and_county_code: "01073",
    hospital_bed_count: "362",
    chrch_affl_f: "N",
    urban_location_f: "Y",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "Y",
    medicare_provider_number: "010011",
    county: "Jefferson County",
    hospital_bed_size: ">299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "3",
    hospital_org_id: "3",
    ein: "630312913",
    name: "Shelby Baptist Medical Center",
    name_cr: "Shelby Baptist Medical Center",
    street_address: "1000 First Street North",
    city: "Alabaster",
    state: "AL",
    cluster_code: "35007",
    fips_state_and_county_code: "01117",
    hospital_bed_count: "252",
    chrch_affl_f: "N",
    urban_location_f: "Y",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010016",
    county: "Shelby County",
    hospital_bed_size: "100-299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "inactive"
  },
  {
    hospital_id: "4",
    hospital_org_id: "4",
    ein: "630459034",
    name: "Callahan Eye Foundation Hosp",
    name_cr: "Callahan Eye Foundation Hosp",
    street_address: "1720 University Boulevard",
    city: "Birmingham",
    state: "AL",
    cluster_code: "35233",
    fips_state_and_county_code: "01073",
    hospital_bed_count: "106",
    chrch_affl_f: "N",
    urban_location_f: "Y",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "Y",
    medicare_provider_number: "010018",
    county: "Jefferson County",
    hospital_bed_size: "100-299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "5",
    hospital_org_id: "5",
    ein: "581973570",
    name: "Cherokee Medical Center",
    name_cr: "Cherokee Medical Center",
    street_address: "400 Northwood Drive",
    city: "Centre",
    state: "AL",
    cluster_code: "35960",
    fips_state_and_county_code: "01019",
    hospital_bed_count: "60",
    chrch_affl_f: "N",
    urban_location_f: "N",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010022",
    county: "Cherokee County",
    hospital_bed_size: "<100 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "6",
    hospital_org_id: "6",
    ein: "636001820",
    name: "Jackson Hospital And Clinic Inc",
    name_cr: "Jackson Hospital And Clinic Inc",
    street_address: "1725 Pine Street",
    city: "Montgomery",
    state: "AL",
    cluster_code: "36106",
    fips_state_and_county_code: "01101",
    hospital_bed_count: "344",
    chrch_affl_f: "N",
    urban_location_f: "Y",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010024",
    county: "Montgomery County",
    hospital_bed_size: ">299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "7",
    hospital_org_id: "7",
    ein: "630288852",
    name: "George H Lanier Memorial Hospital",
    name_cr: "George H Lanier Hospital",
    street_address: "4800 48th St",
    city: "Valley",
    state: "AL",
    cluster_code: "36854",
    fips_state_and_county_code: "01017",
    hospital_bed_count: "115",
    chrch_affl_f: "N",
    urban_location_f: "N",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010025",
    county: "Chambers County",
    hospital_bed_size: "100-299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "8",
    hospital_org_id: "8",
    ein: "475348597",
    name: "Tanner Medical Center-East Alabama",
    name_cr: "Tanner Medical Center-East Alabama",
    street_address: "1032 Main Street South",
    city: "Wedowee",
    state: "AL",
    cluster_code: "36278",
    fips_state_and_county_code: "01111",
    hospital_bed_count: "15",
    chrch_affl_f: "N",
    urban_location_f: "N",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010032",
    county: "Randolph County",
    hospital_bed_size: "<100 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "9",
    hospital_org_id: "9",
    ein: "630047680",
    name: "Community Hospital Inc",
    name_cr: "Community Hospital Inc",
    street_address: "805 Friendship Drive",
    city: "Tallassee",
    state: "AL",
    cluster_code: "36078",
    fips_state_and_county_code: "01051",
    hospital_bed_count: "69",
    chrch_affl_f: "N",
    urban_location_f: "Y",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010034",
    county: "Elmore County",
    hospital_bed_size: "<100 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
  {
    hospital_id: "10",
    hospital_org_id: "10",
    ein: "631058174",
    name: "Cullman Regional",
    name_cr: "Cullman Regional",
    street_address: "1912 Alabama Highway 157",
    city: "Cullman",
    state: "AL",
    cluster_code: "35056",
    fips_state_and_county_code: "01043",
    hospital_bed_count: "115",
    chrch_affl_f: "N",
    urban_location_f: "N",
    children_hospital_f: "N",
    memb_counc_teach_hosps_f: "N",
    medicare_provider_number: "010035",
    county: "Cullman County",
    hospital_bed_size: "100-299 beds",
    updated_dt: "July 11, 2023",
    level: "Level 3",
    status: "active"
  },
];

const topCard_items = [
  {
    Label: "Consultation Providers",
    Value: "50 Providers",
    Percentage: "0%",
    Status: "stable",
  },
  {
    Label: "Physical Providers",
    Value: "130 Centers",
    Percentage: "10%",
    Status: "critical",
  },
  {
    Label: "Consultations",
    Value: "300 consults",
    Percentage: "10%",
    Status: "good",
  },
  {
    Label: "Registered Subscribers",
    Value: "300 Subscribers",
    Percentage: "10%",
    Status: "critical",
  },
  {
    Label: "Subscription Utilization",
    Value: "Ksh. 3,000,000",
    Percentage: "10%",
    Status: "good",
  },
  {
    Label: "Subscriptions Paid",
    Value: "Ksh. 10,000,000",
    Percentage: "60%",
    Status: "good",
  },
];

export { header, hospitals, statusOptions, topCard_items };
