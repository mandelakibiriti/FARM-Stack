import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';
import 'package:google_nav_bar/google_nav_bar.dart';

class HomeBottomNav extends StatelessWidget {
  final Function(int)? onTabChange;
  const HomeBottomNav({super.key, required this.onTabChange});

  // MOBILE-LAYOUT
  Widget _buildMobileLayout(BuildContext context) {
    return Container(
      margin: const EdgeInsets.only(bottom: 15, right: 10, left: 10),
      decoration: BoxDecoration(
        color: Theme.of(context).colorScheme.primaryContainer,
        borderRadius: BorderRadius.circular(24),
      ),
      child: GNav(
          color: Theme.of(context).iconTheme.color,
          tabBackgroundColor:
              Theme.of(context).colorScheme.onSecondary.withOpacity(0.1),
          tabMargin: const EdgeInsets.all(15),
          padding: ScreenSize.smallPhone(context) ? const EdgeInsets.all(5) : const EdgeInsets.all(2),
          onTabChange: (value) => onTabChange!(value),
          iconSize: 24,
          textStyle: Theme.of(context).textTheme.bodyLarge,
          curve: Curves.easeIn,
          tabs: const [
            GButton(
              icon: Icons.health_and_safety,
            ),
            GButton(
              icon: Icons.medication,
            ),
            GButton(
              icon: Icons.vaccines_rounded,
            ),
            GButton(
              icon: Icons.summarize_rounded,
            ),
            GButton(
              icon: Icons.emergency,
            )
          ]),
    );
  }

  // TABLET - DESKTOP LAYOUT
  Widget _buildTabletDesktopLayout(BuildContext context) {
    return Container(
      margin: const EdgeInsets.only(bottom: 15, right: 10, left: 10),
      decoration: BoxDecoration(
        color: Theme.of(context).colorScheme.primaryContainer,
        borderRadius: BorderRadius.circular(24),
      ),
      child: GNav(
          color: Theme.of(context).iconTheme.color,
          tabBackgroundColor:
              Theme.of(context).colorScheme.onSecondary.withOpacity(0.1),
          tabMargin: const EdgeInsets.all(15),
          padding: const EdgeInsets.all(10),
          onTabChange: (value) => onTabChange!(value),
          iconSize: 24,
          textStyle: Theme.of(context).textTheme.bodyLarge,
          curve: Curves.easeIn,
          tabs: const [
            GButton(
              icon: Icons.health_and_safety,
              text: 'Consults',
            ),
            GButton(
              icon: Icons.medication,
              text: 'Pharma',
            ),
            GButton(
              icon: Icons.vaccines_rounded,
              text: 'Labs',
            ),
            GButton(
              icon: Icons.summarize_rounded,
              text: 'Imaging',
            ),
            GButton(
              icon: Icons.emergency,
              text: 'Emergency',
            )
          ]),
    );
  }

  @override
  Widget build(BuildContext context) {
    return LayoutBuilder(builder: (context, constraints) {
      if (ScreenSize.smallPhone(context) || ScreenSize.largePhone(context)) {
        return _buildMobileLayout(context);
      } else {
        return _buildTabletDesktopLayout(context);
      }
    });
  }
}
