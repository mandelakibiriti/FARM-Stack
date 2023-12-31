import 'package:flutter/material.dart';

class DataCard extends StatelessWidget {
  final Widget childWidget;
  const DataCard({super.key, required this.childWidget});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(4.0),
      child: Container(
        color: Theme.of(context).cardColor,
        child: Center(
          child: childWidget,
        )
      ),
    );
  }
}
