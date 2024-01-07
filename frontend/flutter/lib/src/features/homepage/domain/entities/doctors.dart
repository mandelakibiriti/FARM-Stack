import 'package:equatable/equatable.dart';

class DoctorsEntity extends Equatable {
  final int? id;
  final String? name;
  final String? location;
  final String? speciality;
  final int? paymentAmount;
  final bool? activeStatus;

  const DoctorsEntity(
    this.id, 
    this.name, 
    this.location,
    this.speciality, 
    this.paymentAmount, 
    this.activeStatus
  );

  @override
  List<Object?> get props {
    return [
      id,
      name,
      location,
      speciality,
      paymentAmount,
      activeStatus
    ];
  }
}
