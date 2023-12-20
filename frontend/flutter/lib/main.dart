import 'package:flutter/material.dart';
import 'src/core/routes/app_pages.dart';
import 'src/core/themes/app_themes.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp.router(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Dashboard',
      theme: AppTheme.dark,
      routerConfig: AppPages.routes,
    );
  }
}
