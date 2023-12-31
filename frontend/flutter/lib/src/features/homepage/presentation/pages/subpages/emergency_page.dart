import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';
import 'package:flutter_application/src/core/utils/widgets/global_header_card.dart';

class EmergencyPage extends StatefulWidget {
  const EmergencyPage({super.key});

  @override
  State<EmergencyPage> createState() => _EmergencyPageState();
}

class _EmergencyPageState extends State<EmergencyPage> {
  // Widget Params:
  final headerCard = const HeaderCard(
    title: "EMR Metrics",
    date: "Last updated on March 14th, 2023",
    imageLocation: "../assets/hompage/emergency.png",
    minImageWidth: 300,
    maxImageWidth: 400,
  );

  // MOBILE-LAYOUT
  Widget _buildMobileLayout(BuildContext context) {
    return Scaffold(
      backgroundColor: Theme.of(context).colorScheme.primaryContainer,
      body: ListView(children: [
        Center(
          child: SizedBox(
              height: ScreenSize.smallPhone(context) ||
                      ScreenSize.largePhone(context)
                  ? ScreenSize.isScreenHeight(context) * 0.25
                  : ScreenSize.isScreenHeight(context) * 0.2,
              width: ScreenSize.isScreenWidth(context) * 0.9,
              child: headerCard),
        )
      ]),
    );
  }

  // TABLET LAYOUT
  Widget _buildTabletayout(BuildContext context) {
    return Scaffold(
      backgroundColor: Theme.of(context).colorScheme.primaryContainer,
      body: Column(children: [
        SizedBox(
            height: ScreenSize.isScreenHeight(context) * 0.2,
            width: ScreenSize.isScreenWidth(context) * 0.9,
            child: headerCard),
        Row(mainAxisAlignment: MainAxisAlignment.spaceEvenly, children: [
          // Cards
        ]),
      ]),
    );
  }

  // DESKTOP LAYOUT
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
        ]),
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
