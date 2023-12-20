import 'package:flutter/material.dart';
// widgets
import '../../../../core/utils/widgets/navbar.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);
  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    // final currentWidth = MediaQuery.of(context).size.width;
    return Scaffold(
        appBar: AppBar(
          title: const Text(
            "Homepage",
          ),
        ),
        drawer: const MyAppNav(),
        // body: Center(
        //   child: Container(
        //       height: 300,
        //       width: 300,
        //       decoration: BoxDecoration(
        //           color: Colors.green, borderRadius: BorderRadius.circular(20)),
        //       padding: const EdgeInsets.all(25),
        //       child: const Text(
        //         "Text Info",
        //         style: TextStyle(
        //             color: Colors.white,
        //             fontSize: 18,
        //             fontWeight: FontWeight.bold),
        //       )),
        // )
    );
  }
}
