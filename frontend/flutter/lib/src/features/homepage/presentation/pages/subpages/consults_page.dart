import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';
import 'package:flutter_application/src/core/utils/widgets/global_header_card.dart';
import 'package:flutter_application/src/core/utils/widgets/global_card.dart';
import 'package:flutter_application/src/core/utils/widgets/global_tile.dart';

class ConsultsPage extends StatefulWidget {
  const ConsultsPage({super.key});

  @override
  State<ConsultsPage> createState() => _ConsultPageState();
}

// Card highlighting page
// - Number of general practioners
// - Number of specialists
// - Number of other carders
// - Number of consultations (indicator based on previous month) - conditional formatting
// Regional / Country specific data (tab that chooses a country)
// KPI elements
// Table - Number of doctors (GPs,Specialists,Other Carders)
// Table - Number of consultations - booked, completed, type(video,chat), paidFor(subscription,cash,insurance)
// Graphs higlighting number of consultations per month
// Pie Chart breaking down type of doctors
// Indicators highlighting changes in the number of consultations,doctors,patient cateogries based on paidFor
// Forms - Registration of doctors and upload files

class _ConsultPageState extends State<ConsultsPage> {
  // Widget Params:
  final headerCard = const HeaderCard(
      title: "Consultation Metrics",
      date: "Last updated on March 14th, 2023",
      imageLocation: "../assets/hompage/teleconsults_dark.png",
      minImageWidth: 240,
      maxImageWidth: 300);

  final dataCard = const DataCard(childWidget: Text('My Card'));
  final dataTile = const DataTile(childWidget: Text('My Tile'));

  /*            *\           
    MOBILE LAYOUT
  \*            */
  Widget _buildMobileLayout(BuildContext context) {
    return DefaultTabController(
        length: 2,
        child: Scaffold(
          backgroundColor: Theme.of(context).colorScheme.primaryContainer,
          body: Column(children: [
            // Header Card
            Center(
                child: Container(
              margin: const EdgeInsets.only(bottom: 10),
              child: SizedBox(
                  height: ScreenSize.smallPhone(context) ||
                          ScreenSize.largePhone(context)
                      ? ScreenSize.isScreenHeight(context) * 0.25
                      : ScreenSize.isScreenHeight(context) * 0.2,
                  width: ScreenSize.isScreenWidth(context) * 0.95,
                  child: headerCard),
            )),

            // Tabs
            TabBar(tabs: [
              Tab(
                  text: 'Summary',
                  icon: Icon(
                    Icons.add_chart_rounded,
                    color: Theme.of(context).iconTheme.color,
                  )),
              Tab(
                text: 'Details',
                icon: Icon(Icons.table_chart_rounded,
                    color: Theme.of(context).iconTheme.color),
              )
            ]),
            Expanded(
                child: TabBarView(children: [
              // Cards
              GridView.builder(
                  itemCount: 8, //Length of Array
                  gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 1),
                  itemBuilder: (context, index) {
                    return DataCard(
                        childWidget:
                            dataCard //Setup key widgets in cards and relevant imports
                        );
                  }),

              // Tiles
              ListView.builder(
                  itemCount: 5, //Length of Map
                  itemBuilder: (context, index) {
                    return DataTile(childWidget: dataTile);
                  })
            ]))
          ]),
        ));
  }

  /*            *\           
   TABLET LAYOUT
  \*            */
  Widget _buildTabletayout(BuildContext context) {
    return DefaultTabController(
        length: 2,
        child: Scaffold(
          backgroundColor: Theme.of(context).colorScheme.primaryContainer,
          body: Column(children: [
            Center(
                child: Container(
              margin: const EdgeInsets.only(bottom: 30),
              child: SizedBox(
                  height: ScreenSize.smallPhone(context) ||
                          ScreenSize.largePhone(context)
                      ? ScreenSize.isScreenHeight(context) * 0.25
                      : ScreenSize.isScreenHeight(context) * 0.2,
                  width: ScreenSize.isScreenWidth(context) * 0.95,
                  child: headerCard),
            )),
            // Tabs
            TabBar(tabs: [
              Tab(
                  text: 'Summary',
                  icon: Icon(
                    Icons.add_chart_rounded,
                    color: Theme.of(context).iconTheme.color,
                  )),
              Tab(
                text: 'Details',
                icon: Icon(Icons.table_chart_rounded,
                    color: Theme.of(context).iconTheme.color),
              )
            ]),
            Expanded(
                child: TabBarView(children: [
              // Cards
              GridView.builder(
                  itemCount: 8, //Length of Array
                  gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                    crossAxisCount: 2,
                  ),
                  itemBuilder: (context, index) {
                    return DataCard(
                        childWidget:
                            dataCard //Setup key widgets in cards and relevant imports
                        );
                  }),

              // Tiles
              ListView.builder(
                  itemCount: 5, //Length of Map
                  itemBuilder: (context, index) {
                    return DataTile(childWidget: dataTile);
                  })
            ]))
          ]),
        ));
  }

  /*            *\           
   DESKTOP LAYOUT
  \*            */
  Widget _buildDesktopLayout(BuildContext context) {
    return Scaffold(
      backgroundColor: Theme.of(context).colorScheme.primaryContainer,
      body: Column(children: [
        SizedBox(
            height: ScreenSize.isScreenHeight(context) <= 600
                ? ScreenSize.isScreenHeight(context) * 0.23
                : ScreenSize.isScreenHeight(context) * 0.2,
            width: ScreenSize.isScreenWidth(context) * 0.9,
            child: headerCard),
        Row(mainAxisAlignment: MainAxisAlignment.spaceEvenly, children: [
          // Cards
        ])
      ]),
    );
  }

  @override
  Widget build(BuildContext context) {
    return LayoutBuilder(builder: (context, constraints) {
      if (ScreenSize.smallPhone(context) || ScreenSize.largePhone(context)) {
        return _buildMobileLayout(context);
      } else if (ScreenSize.tablet(context)) {
        return _buildTabletayout(context);
      } else {
        return _buildDesktopLayout(context);
      }
    });
  }
}
