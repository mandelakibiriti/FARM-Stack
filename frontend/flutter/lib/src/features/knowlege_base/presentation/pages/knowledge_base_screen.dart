import 'package:flutter/material.dart';

class KnowledgeBasePage extends StatefulWidget {
  const KnowledgeBasePage({Key? key}) : super(key: key);
  @override
  State<KnowledgeBasePage> createState() => _KnowledgeBasePageState();
}

class _KnowledgeBasePageState extends State<KnowledgeBasePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.deepPurple[200],
        appBar: AppBar(
          title: const Text(
            "Knowledege Base",
            style: TextStyle(color: Colors.white),
          )
        ),
    );
  }
}
