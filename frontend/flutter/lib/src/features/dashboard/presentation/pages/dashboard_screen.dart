library dashboard_page;
import 'package:flutter/material.dart';
// widgets
import '../../../../core/utils/widgets/global_navbar.dart';
import '../../../../core/utils/widgets/global_app_bar.dart';

class DashboardPage extends StatefulWidget {
  const DashboardPage({super.key});
  @override
  State<DashboardPage> createState() => _DashboardPageState();
}

class _DashboardPageState extends State<DashboardPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Theme.of(context).colorScheme.primaryContainer,
        appBar: const MyAppBar(title: "Dashboard", height: 60.0,),
        drawer: const MyAppNav(),
    );
  }
}
