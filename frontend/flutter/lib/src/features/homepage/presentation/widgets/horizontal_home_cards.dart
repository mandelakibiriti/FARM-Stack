import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';

// TODO: Convert horizontal card into vertical card
// TODO: Conditional formatting for layout based on screen size
// TODO: Conditional formatting for changes in values in cards


class HorizontalCard extends StatelessWidget {
  const HorizontalCard({super.key});
  @override
  Widget build(BuildContext context) {
    return Card(
      margin: const EdgeInsets.all(20),
      color: Theme.of(context).cardColor,
      clipBehavior: Clip.antiAlias, // enables rounded edges for image
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(24)),
      child: Stack(
        children: [
          Ink.image(
            image: const AssetImage("../assets/hompage/teleconsults_dark.png"),
            height: 180,
            fit: BoxFit.contain,
            alignment: Alignment.centerRight,
          ), // assets location parameter
          Padding(
            padding: const EdgeInsets.all(25),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  "Care Provision Metrics", //Title Parameter
                  style: Theme.of(context).textTheme.titleLarge,
                ),
                SizedBox(
                  width: ScreenSize.isScreenWidth(context) *
                      0.6, //Screen size conditional formating required
                  child: Row(
                    children: [
                      Text(
                        "200", // Data Parameter
                        style: Theme.of(context).textTheme.displaySmall,
                      ),
                      SizedBox(
                        width: ScreenSize.isScreenWidth(context) *
                            0.2, //Screen size conditional formating required
                        child: const ListTile(
                          title: Text(
                            "19%",
                            style: TextStyle(
                              color: Colors.green,
                              fontFamily: 'Roboto',
                              fontSize: 24,
                            ),
                          ),
                          leading: Icon(
                            Icons.arrow_circle_up_rounded,
                            color: Colors
                                .green, // Conditional formating on changes in value
                          ),
                        )
                      ),
                    ],
                  ),
                ),
                Text(
                  "Compared to 172 consultations last year", // Data Parameter
                  style: Theme.of(context).textTheme.bodyMedium,
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
