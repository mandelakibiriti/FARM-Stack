import 'package:flutter/material.dart';

/// all custom application theme
class AppTheme {
  /// default application theme
  static ThemeData get dark => ThemeData(
    useMaterial3: true,
    colorScheme: ColorScheme.fromSeed(
      seedColor: Colors.blue,
      brightness: Brightness.dark,
    ),
  );
  static ThemeData get light => ThemeData(
    useMaterial3: true,
    colorScheme: ColorScheme.fromSeed(
      seedColor: Colors.lightBlue,
      brightness: Brightness.light
    ),
  );

  // you can add other custom theme in this class like  light theme, dark theme ,etc.

  // example :
  // static ThemeData get light => ThemeData();
  // static ThemeData get dark => ThemeData();
}