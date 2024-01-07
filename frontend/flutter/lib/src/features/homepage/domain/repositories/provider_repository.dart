import 'package:dartz/dartz.dart';
import 'package:flutter_application/src/core/networking/failure.dart';
import 'package:flutter_application/src/features/homepage/domain/entities/provider.dart';

abstract class DoctorRepository {
  Future<Either<Failure, ProviderEntity>> getProviders();
}
