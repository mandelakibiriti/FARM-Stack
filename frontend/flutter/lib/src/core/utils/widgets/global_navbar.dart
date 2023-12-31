import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

// List Tile parameters
const List navList = [
  {'name': 'H O M E', 'icon': Icons.home_rounded, 'route': '/'},
  {
    'name': 'D A S H B O A R D',
    'icon': Icons.space_dashboard_rounded,
    'route': '/dashboard'
  },
  {
    'name': 'K N O W L E D G E - B A S E',
    'icon': Icons.data_array_rounded,
    'route': '/knowledge_base'
  }
];

class MyAppNav extends StatelessWidget {
  const MyAppNav({super.key});
  @override
  Widget build(BuildContext context) {
    return Drawer(
      backgroundColor: Theme.of(context).colorScheme.primaryContainer,
      child: Column(
        children: [
          // Account Drawer Head
          UserAccountsDrawerHeader(
            decoration: BoxDecoration(color: Theme.of(context).colorScheme.primaryContainer),
            accountName: Text(
              "User Name",
              style: Theme.of(context).textTheme.bodyMedium,
            ),
            accountEmail: Text("username@gmail.com",
                style: Theme.of(context).textTheme.bodySmall,
            ),
            currentAccountPicture: CircleAvatar(
              backgroundColor: Theme.of(context).colorScheme.onSurface,
              child: const FlutterLogo(size: 14),
            ),
          ),
          // Navigation Items
          for (final nav in navList)
            ListTile(
              contentPadding: const EdgeInsets.only(top: 5, left: 15),
              minLeadingWidth: 40,
              title: Text(
                nav['name'],
                style: Theme.of(context).textTheme.bodyMedium,
              ),
              leading: Icon(nav['icon'], size: 20),
              onTap: () {
                GoRouter.of(context).push(nav['route']);
              },
            ),
          // Bottom Navigation Items
          const Spacer(), // Pushes the column to the bottom
          Column(children: [
            Divider(
                thickness: 1,
                color: Theme.of(context).colorScheme.onBackground),
            ListTile(
              contentPadding: const EdgeInsets.only(top: 5, left: 15),
              minLeadingWidth: 40,
              title: Text(
                'L O G I N / L O G O U T',
                style: Theme.of(context).textTheme.bodyMedium,
              ),
              leading: const Icon(Icons.supervised_user_circle_rounded),
            ),
            ListTile(
              contentPadding: const EdgeInsets.only(top: 5, left: 15),
              minLeadingWidth: 40,
              title: Text(
                'S E T T I N G S',
                style: Theme.of(context).textTheme.bodyMedium,
              ),
              leading: const Icon(Icons.settings),
            )
          ]),
        ],
      ),
    );
  }
}
