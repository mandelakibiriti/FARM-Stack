import 'package:dartz/dartz.dart';
import 'package:flutter_application/src/core/networking/failure.dart';
import 'package:flutter_application/src/features/homepage/domain/entities/doctors.dart';
import 'package:flutter_application/src/features/homepage/domain/repositories/doctor_repository.dart';

class GetDoctorsUseCase {
  final DoctorRepository doctorRepository;

  GetDoctorsUseCase(this.doctorRepository);

  Future<Either<Failure, DoctorsEntity>> execute(int doctorsId) {
    return doctorRepository.getDoctors(doctorsId);
  }
}
