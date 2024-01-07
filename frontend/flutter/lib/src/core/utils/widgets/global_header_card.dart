import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';

class HeaderCard extends StatelessWidget {
  final String title;
  final String date;
  final String imageLocation;
  final double minImageWidth;
  final double maxImageWidth;

  const HeaderCard(
      {super.key,
      required this.title,
      required this.date,
      required this.imageLocation,
      required this.minImageWidth,
      required this.maxImageWidth}
  );
  
  @override
  Widget build(BuildContext context) {
    return Stack(children: [
      Container(
          margin: const EdgeInsets.only(top: 30),
          padding: ScreenSize.smallPhone(context)
              ? const EdgeInsets.all(5)
              : const EdgeInsets.all(20),
          decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(32),
              gradient: LinearGradient(
                colors: [
                  Theme.of(context).colorScheme.brightness == Brightness.light
                      ? Theme.of(context).colorScheme.primary // light theme
                      : Theme.of(context).colorScheme.onPrimary, // dark theme
                  Theme.of(context).colorScheme.brightness == Brightness.light
                      ? Theme.of(context).colorScheme.onPrimary // light theme
                      : Theme.of(context).colorScheme.onSecondary, // dark theme
                ],
                begin: Alignment.topRight,
                end: Alignment.bottomLeft,
              )),
          child: Stack(children: [
            Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: [
                  Text(
                    title, //Title Parameter
                    style: ScreenSize.smallPhone(context) 
                        ? Theme.of(context).textTheme.titleSmall
                        : Theme.of(context).textTheme.titleLarge,
                  ),
                  Row(
                    children: [
                      Icon(
                        Icons.update,
                        color: Theme.of(context).iconTheme.color,
                      ),
                      const SizedBox(width: 16),
                      Text(
                        date,
                        style: ScreenSize.smallPhone(context)
                            ? Theme.of(context).textTheme.labelSmall
                            : Theme.of(context).textTheme.labelMedium,
                      ), //Date Parameter
                    ],
                  ),
                ]),
          ])),
      // Checks Screen Size and removes Images for smaller devices
      ScreenSize.largePhone(context) | ScreenSize.smallPhone(context)
          ? const SizedBox.shrink()
          : Positioned(
              bottom: ScreenSize.isScreenHeight(context) < 700
                  ? ScreenSize.isScreenHeight(context) * -0.15
                  : -95,
              right: -40,
              child: Image.asset(
                imageLocation, // image Asset parameter
                width: ScreenSize.tablet(context) || ScreenSize.isScreenHeight(context) < 700  ? minImageWidth : maxImageWidth,
            )
          ),
    ]);
  }
}
