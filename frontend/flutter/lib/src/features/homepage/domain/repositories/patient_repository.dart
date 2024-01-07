import 'package:dartz/dartz.dart';
import 'package:flutter_application/src/core/networking/failure.dart';
import 'package:flutter_application/src/features/homepage/domain/entities/patient.dart';

abstract class DoctorRepository {
  Future<Either<Failure, PatientEntity>> getPatients();
}
