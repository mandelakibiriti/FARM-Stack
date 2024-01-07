import 'package:equatable/equatable.dart';

class ProviderEntity extends Equatable {
  final int? id;
  final String? name;
  final String? location;
  final String? providerType;
  final int? paymentPeriod;
  final bool? activeStatus;

  const ProviderEntity(
    this.id, 
    this.name, 
    this.location,
    this.providerType, 
    this.paymentPeriod, 
    this.activeStatus
  );

  @override
  List<Object?> get props {
    return [
      id,
      name,
      location,
      providerType,
      paymentPeriod,
      activeStatus
    ];
  }
}
