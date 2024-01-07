import 'package:equatable/equatable.dart';

class PatientEntity extends Equatable {
  final int? id;
  final String? name;
  final String? location;
  final String? subscriptionLevel;
  final String? paymentMethod;
  final bool? activeSubscription;

  const PatientEntity(
    this.id, 
    this.name, 
    this.location,
    this.subscriptionLevel, 
    this.paymentMethod, 
    this.activeSubscription
  );

  @override
  List<Object?> get props {
    return [
      id,
      name,
      location,
      subscriptionLevel,
      paymentMethod,
      activeSubscription
    ];
  }
}
