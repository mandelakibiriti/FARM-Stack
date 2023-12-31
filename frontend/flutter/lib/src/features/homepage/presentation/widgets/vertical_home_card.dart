import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';

class VerticalCard extends StatefulWidget {
  const VerticalCard({super.key});

  @override
  State<VerticalCard> createState() => _VerticalCardState();
}

class _VerticalCardState extends State<VerticalCard> {
  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.all(20),
      height: 180,
      width: ScreenSize.isScreenWidth(context)*0.2, //Device layout width
      child: 
      Card(
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(24)),
        color: Theme.of(context).cardColor,
        child: Row(
        children: [
          ClipRRect(
            borderRadius: BorderRadius.circular(16),
            child: Image.asset(
              "../assets/hompage/teleconsults.png",
              fit: BoxFit.cover,
            ),
          ),
          Column(
            children: [
              Padding(
                padding: const EdgeInsets.only(top:40,left:15),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Care Provision Metrics", //Title Parameter
                      style: Theme.of(context).textTheme.titleLarge,
                    ),
                    SizedBox(
                      width: 300, //Screen size conditional formating required
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Text(
                            "200 Consults", // Data Parameter
                            style: Theme.of(context).textTheme.displaySmall,
                          ),
                          const Text(
                            "19%",
                            style: TextStyle(
                              color: Colors.green,
                              fontFamily: 'Roboto',
                              fontSize: 24,
                            ),
                          ),
                          const Icon(
                            Icons.arrow_circle_up_rounded,
                            color: Colors
                                .green, // Conditional formating on changes in value
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
          )
        ],
      ),
      ),
      );
  }
}
