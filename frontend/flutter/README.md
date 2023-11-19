# flutter_application

A new Flutter project.

## Getting Started

This project is a starting point for a Flutter application.

A few resources to get you started if this is your first Flutter project:

- [Lab: Write your first Flutter app](https://docs.flutter.dev/get-started/codelab)
- [Cookbook: Useful Flutter samples](https://docs.flutter.dev/cookbook)

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.

## Folder Structure
```bash
/frontend
└── /lib # Root directory for Dart source code
|    └── /src # Source code for the application
|    |    └── /features # Feature-based code organization
|    |    └────── /dashboard # Dashboard feature module
|    |    |       |    
|    |    |       └── /domain
|    |    |       |   └── entities
|    |    |       |   |  └── dashboard_entity.dart # Business entities for Dashboard - what elements are required for the dashboard
|    |    |       |   └── usecases
|    |    |       |      └── get_dashboard_info.dart # Business logic/use cases for Dashboard - what operations will be run on the dashboard
|    |    |       |    
|    |    |       └── /data
|    |    |       |    └── models
|    |    |       |    |   └── dashboard_model.dart # Serialization and deserialization of data (converting data to and from JSON, for example), and they represent the   
|    |    |       |    |                            # data structure within the app
|    |    |       |    └── repositories
|    |    |       |    |   └── dashboard_repository_impl.dart # Mediate between data sources and the rest of the application, applying business logic to data operations
|    |    |       |    |
|    |    |       |    └── datasources
|    |    |       |        └── dashboard_remote_data_source.dart # Handle the direct interaction with external data sources (APIs, databases)
|    |    |       |    
|    |    |       └── /presentation
|    |    |               └── pages
|    |    |               |   └── dashboard_page.dart # UI Page for Dashboard
|    |    |               └── widgets
|    |    |               |   └── dashboard_widget.dart # Custom widgets for Dashboard page
|    |    |               └── bloc # Can use Riverpod as well
|    |    |                   └── dashboard_bloc.dart  # Bloc for state management in Dashboard
|    |    |                   └── dashboard_event.dart  # Events for Dashboard Bloc
|    |    |                   └── dashboard_state.dart  # States for Dashboard Bloc
|    |    |
|    |    └────── /user_profile  # User Profile feature module
|    |    |       # Similar structure to /dashboard
|    |    |
|    |    └────── /core   # Core functionality and utilities shared across the app
|    |              └─── /networking # Networking related utilities and setup
|    |              └─── /utils # Common utility functions and classes
|    └── main.dart  # Entry point of the application
|
└── /test # Test files for the application
└── pubspec.yaml  # Flutter project configuration file
```
