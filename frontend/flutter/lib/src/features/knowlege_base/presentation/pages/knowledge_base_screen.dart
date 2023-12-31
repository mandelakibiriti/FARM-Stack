import 'package:flutter/material.dart';
// widgets
import '../../../../core/utils/widgets/global_navbar.dart';
import '../../../../core/utils/widgets/global_app_bar.dart';

class KnowledgeBasePage extends StatefulWidget {
  const KnowledgeBasePage({super.key});
  @override
  State<KnowledgeBasePage> createState() => _KnowledgeBasePageState();
}

class _KnowledgeBasePageState extends State<KnowledgeBasePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Theme.of(context).colorScheme.primaryContainer,
        appBar: const MyAppBar(title: "Knowledge Base", height: 60.0,),
        drawer: const MyAppNav(),
    );
  }
}
