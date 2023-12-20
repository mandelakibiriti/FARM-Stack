import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

// List Tile parameters
const List navList = [
  {'name': 'H O M E', 'icon': Icons.home, 'route': '/'},
  {'name': 'D A S H B O A R D', 'icon': Icons.dashboard, 'route': '/dashboard'},
  {
    'name': 'K N O W L E D G E  B A S E',
    'icon': Icons.data_object_sharp,
    'route': '/knowledge_base'
  }
];

class MyAppNav extends StatelessWidget {
  const MyAppNav({super.key});
  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: Column(
        children: [
          const UserAccountsDrawerHeader(
            decoration: BoxDecoration(color: Color.fromARGB(255, 31, 72, 96)),
            accountName: Text(
              "User Name",
            ),
            accountEmail: Text("username@gmail.com"),
            currentAccountPicture: CircleAvatar(
              backgroundColor: Color.fromARGB(255, 96, 118, 141),
              child: FlutterLogo(size: 14),
            ),
          ),
          for (final nav in navList)
            ListTile(
              title: Text(
                nav['name'],
              ),
              leading: Icon(nav['icon']),
              onTap: () {
                GoRouter.of(context).push(nav['route']);
              },
            )
        ],
      ),
    );
  }
}
