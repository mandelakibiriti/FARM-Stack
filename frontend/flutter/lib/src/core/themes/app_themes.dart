import 'package:flutter/material.dart';

// Light Theme
ThemeData lightTheme = ThemeData(
  brightness: Brightness.light,
  useMaterial3: true,
  
  textTheme: const TextTheme(
    // Title
    titleSmall: TextStyle(fontFamily: 'Raleway'),
    titleMedium: TextStyle(
      fontFamily: 'Raleway',
      fontSize: 20,
    ),
    titleLarge: TextStyle(
      fontFamily: 'Roboto',
    ),
    // Display
    displayLarge: TextStyle(
      fontSize: 72,
      fontWeight: FontWeight.bold,
      fontFamily: 'Raleway',
    ),
    displayMedium: TextStyle(
      fontWeight: FontWeight.bold,
      fontFamily: 'Raleway',
    ),
    displaySmall: TextStyle(
      fontWeight: FontWeight.bold,
      fontSize: 32,
      fontFamily: 'Raleway',
    ),
    // Body
    bodyLarge: TextStyle(
      fontWeight: FontWeight.bold,
      fontFamily: 'Roboto',
    ),
    bodySmall: TextStyle(
      fontFamily: 'Raleway',
    ),
    // Label
    labelMedium: TextStyle(fontFamily: 'Raleway'),
  ),
  // Color Theme
  cardColor: Colors.blueGrey[50],
  primarySwatch: Colors.blue,
  colorScheme: ColorScheme.fromSeed(
    seedColor: Colors.blue,
    brightness: Brightness.light,
    primaryContainer: Colors.grey[300],
  ),
  iconTheme: const IconThemeData(color: Colors.blue),
);

// Dark theme
ThemeData darkTheme = ThemeData(
  brightness: Brightness.dark,
  useMaterial3: true,
  textTheme: const TextTheme(
    // Title
    titleSmall: TextStyle(fontFamily: 'Raleway'),
    titleMedium: TextStyle(
      fontFamily: 'Raleway',
      fontSize: 20,
    ),
    titleLarge: TextStyle(
      fontFamily: 'Roboto',
    ),
    // Display
    displayLarge: TextStyle(
      fontSize: 72,
      fontWeight: FontWeight.bold,
      fontFamily: 'Raleway',
    ),
    displayMedium: TextStyle(
      fontWeight: FontWeight.bold,
      fontFamily: 'Raleway',
    ),
    displaySmall: TextStyle(
      fontWeight: FontWeight.bold,
      fontSize: 32,
      fontFamily: 'Raleway',
    ),
    // Body
    bodyLarge: TextStyle(
      fontWeight: FontWeight.bold,
      fontFamily: 'Roboto',
    ),
    bodySmall: TextStyle(
      fontFamily: 'Raleway',
    ),
    // Label
    labelMedium: TextStyle(fontFamily: 'Raleway'),
  ),
  // Color Theme
  primarySwatch: Colors.blue,
  colorScheme: ColorScheme.fromSeed(
    seedColor: Colors.blue,
    brightness: Brightness.dark,
    primaryContainer: Colors.black,
  ),
  iconTheme: const IconThemeData(color: Colors.blue),
);
