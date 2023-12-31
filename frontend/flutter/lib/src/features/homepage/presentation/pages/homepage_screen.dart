import 'package:flutter/material.dart';

// Local Widgets
import 'package:flutter_application/src/features/homepage/presentation/widgets/home_bottom_nav.dart';
import 'subpages/consults_page.dart';
import 'subpages/emergency_page.dart';
import 'subpages/imaging_page.dart';
import 'subpages/labs_page.dart';
import 'subpages/pharma_page.dart';

// Global Widgets
import '../../../../core/utils/widgets/global_navbar.dart';
import '../../../../core/utils/widgets/global_app_bar.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});
  @override
  State<HomePage> createState() => _HomePageState();
}
class _HomePageState extends State<HomePage> {
  // use to select index for HomeBottomNav
  // updates selected index
  int _selectedIndex = 0;

  void navigateHomeBottomBar(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  // List of pages on HomePage Screen
  final List<Widget> _pages = [
    // Sub-Pages under HomePage 
    // Order should be maintained as pages appear in HomeBottomNav
    const ConsultsPage(),
    const PharmaPage(),
    const LabsPage(),
    const ImagingPage(),
    const EmergencyPage()
  ];

  @override
  Widget build(BuildContext context) {
    // final currentWidth = MediaQuery.of(context).size.width;
    return Scaffold(
      backgroundColor: Theme.of(context).colorScheme.primaryContainer,
      appBar: const MyAppBar(title: "Homepage", height: 60.0),
      drawer: const MyAppNav(),
      bottomNavigationBar: HomeBottomNav(
        onTabChange:(index) => navigateHomeBottomBar(index),
      ),
      body: _pages[_selectedIndex],
    );
  }
}
