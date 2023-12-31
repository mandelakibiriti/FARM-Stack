import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/themes/theme_provider.dart';
import 'package:provider/provider.dart';

class MyAppBar extends StatelessWidget implements PreferredSizeWidget {
  final String title;
  final double height;

  const MyAppBar({super.key, required this.title, required this.height});

  @override
  Size get preferredSize => Size.fromHeight(height);
  String get appTitle => title;

  @override
  Widget build(BuildContext context) {
    return AppBar(
      backgroundColor: Colors.transparent,
      title: Text(
        appTitle,
        style: Theme.of(context).textTheme.titleMedium,
      ),
      toolbarHeight: height,
      actions: [
        IconButton(
            onPressed: () {
              Provider.of<ThemeProvider>(context, listen: false).toggleTheme();
            },
            icon: Icon(
              Icons.brightness_6,
              color: Theme.of(context).iconTheme.color,
              ))
      ],
    );
  }
}
