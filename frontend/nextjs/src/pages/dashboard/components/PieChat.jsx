'use client'
import { 
  Card, Title, DonutChart, Button, Icon, 
  List, ListItem, BadgeDelta
} from "@tremor/react";
import { ArrowNarrowRightIcon, HeartIcon } from "@heroicons/react/solid";

const care_access = [
  {
    name: "Symptom Checker",
    quantity: 10567,
    delta:"1.2%",
    deltaType: "moderateDecrease",
  },
  {
    name: "Consulations",
    quantity: 1200,
    delta:"5.2%",
    deltaType: "increase",
  },
  {
    name: "Consultation and Referrals",
    quantity: 390,
    delta:"1.2%",
    deltaType: "moderateDecrease",
  },
  {
    name: "Offline Care",
    quantity: 240,
    delta:"1.2%",
    deltaType: "increase",
  }
];

export default function PieChart() {
  return (
    <Card className="drop-shadow-lg" decoration="top" color="indigo">
      <div className="flex gap-x-4">
      <Icon variant="light" icon={HeartIcon} size="lg" color="indigo" />
        <Title>Care Access</Title>
      </div>
      {/* <Legend categories={care_access.map((care_access) => care_access.name)} colors={["violet", "indigo", "rose", "amber"]} className="dark:text-muted mt-6" /> */}
      <DonutChart
        className="mt-6"
        data={care_access}
        category="quantity"
        index="name"
        colors={["violet", "indigo", "rose", "amber"]}
      />

      <List>
        {
          care_access.map((care_access)=>(
            <ListItem key={care_access.name}>
                {care_access.name}
                <BadgeDelta deltaType={care_access.deltaType} size="xs">
                  {care_access.delta}
                </BadgeDelta>
            </ListItem>
          ))
        }
      </List>

      <Button
      size="sm"
      variant="light"
      icon={ArrowNarrowRightIcon}
      iconPosition="right"
      className="mt-3 hover:translate-x-4 duration-500"
      >
          View details
      </Button>  
    </Card>
  );
}