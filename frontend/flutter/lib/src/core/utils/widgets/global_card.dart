import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';

class DataCard extends StatelessWidget {
  final Map childData;
  final double elemPadding;
  const DataCard(
      {super.key, required this.childData, required this.elemPadding});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(elemPadding),
      child: Container(
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(16),
          color: Theme.of(context).cardColor,
          boxShadow: [
            Theme.of(context).colorScheme.brightness == Brightness.light
                ? BoxShadow(
                    color: Theme.of(context).colorScheme.secondary,
                    blurRadius: 0.2,
                    blurStyle: BlurStyle.inner,
                    offset: const Offset(0, 0.8))
                : const BoxShadow() // null
          ],
        ),
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                childData['description'],
                style: Theme.of(context).textTheme.bodyMedium,
              ),
              Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                mainAxisAlignment: MainAxisAlignment.start,
                children: [
                  Text(
                    childData['value'],
                    style: Theme.of(context).textTheme.titleLarge,
                  ),
                  const SizedBox(
                    width: 20,
                  ),
                  Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        if (childData['increase'] == "true")
                          const Icon(
                            Icons.north_rounded,
                            color: Colors.green,
                            size: 15,
                          ),
                        if (childData['increase'] == 'false')
                          Icon(
                            Icons.south_rounded,
                            color: Colors.red[800],
                            size: 15,
                          ),
                        if (childData['increase'] == 'none')
                          Icon(
                            Icons.north_east_rounded,
                            color: Colors.amber[700],
                            size: 15,
                          ),
                        Text(childData['diff'],
                            style: TextStyle(
                              fontWeight: FontWeight.w800,
                              fontSize: 15,
                              fontFamily: 'Raleway',
                              color: childData['increase'] == "true"
                                  ? Colors.green
                                  : childData['increase'] == "false"
                                      ? Colors.red[800]
                                      : Colors.amber[700],
                            )),
                      ])
                ],
              )
            ],
          ),
        ),
      ),
    );
  }
}
