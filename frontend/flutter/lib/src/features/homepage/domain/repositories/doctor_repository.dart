import 'package:dartz/dartz.dart';
import 'package:flutter_application/src/core/networking/failure.dart';
import 'package:flutter_application/src/features/homepage/domain/entities/doctors.dart';

abstract class DoctorRepository {
  Future<Either<Failure, DoctorsEntity>> getDoctors(int doctorsId);
}
