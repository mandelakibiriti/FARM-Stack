library dashboard_page;
import 'package:flutter/material.dart';

class DashboardPage extends StatefulWidget {
  const DashboardPage({Key? key}) : super(key: key);
  @override
  State<DashboardPage> createState() => _DashboardPageState();
}

class _DashboardPageState extends State<DashboardPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.deepPurple[200],
        appBar: AppBar(
          title: const Text(
            "Dashboard",
            style: TextStyle(color: Colors.white),
          )
        ),
    );
  }
}
