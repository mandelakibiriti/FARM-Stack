import 'package:go_router/go_router.dart';
import 'package:flutter_application/src/features/dashboard/presentation/pages/dashboard_screen.dart';
import 'package:flutter_application/src/features/knowlege_base/presentation/pages/knowledge_base_screen.dart';
import 'package:flutter_application/src/features/homepage/presentation/pages/homepage_screen.dart';

/// contains all configuration pages
class AppPages {
  /// when the app is opened, this page will be the first to be shown

  static final routes = GoRouter(routes: [
    GoRoute(
      path: '/',
      builder: (context, state) => const HomePage(),
    ),
    GoRoute(
      path: '/dashboard',
      builder: (context, state) => const DashboardPage(),
    ),
    GoRoute(
      path: '/knowledge_base',
      builder: (context, state) => const KnowledgeBasePage(),
    ),
  ]);
}
