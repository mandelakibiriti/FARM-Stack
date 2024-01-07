import 'package:flutter/material.dart';
import 'package:fl_chart/fl_chart.dart';

class Graph extends StatelessWidget {
  const Graph({super.key});
  @override
  Widget build(BuildContext context) {
    return LineChart(
      LineChartData(
        // read about it in the LineChartData section
        
      ),
      duration: const Duration(milliseconds: 150), // Optional
      curve: Curves.linear, // Optional
    );
  }
}