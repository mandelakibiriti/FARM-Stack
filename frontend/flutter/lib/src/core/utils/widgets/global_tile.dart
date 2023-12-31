import 'package:flutter/material.dart';
import 'package:flutter_application/src/core/utils/layout/device_info.dart';

class DataTile extends StatelessWidget {
  final Widget childWidget;
  const DataTile({super.key, required this.childWidget});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: Container (
          color: Theme.of(context).cardColor,
          height: ScreenSize.isScreenHeight(context)*0.4,
          child: childWidget,
        )
    );
  }
}
