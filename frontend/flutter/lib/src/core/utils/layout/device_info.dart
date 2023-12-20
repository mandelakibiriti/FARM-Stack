import 'package:flutter/material.dart';
import 'package:universal_platform/universal_platform.dart';

const bool kIsWeb = bool.fromEnvironment('dart.library.js_util');

class ScreenSize {
  // Use .shortestSide to detect device type regardless of orientation
  static bool smallPhone(BuildContext context) {
    var screenWidth = MediaQuery.of(context).size.shortestSide; 
    return screenWidth <= 300;
  }
  static bool largePhone(BuildContext context) {
    var screenWidth = MediaQuery.of(context).size.shortestSide; 
    return screenWidth <= 600;
  }
  static bool tablet(BuildContext context) {
    var screenWidth = MediaQuery.of(context).size.shortestSide; 
    return screenWidth <= 900;
  }
  static bool desktop(BuildContext context) {
    var screenWidth = MediaQuery.of(context).size.shortestSide; 
    return screenWidth > 900;
  }
}

class DeviceOS {
  // Syntax sugar, proxy the UniversalPlatform methods so our views can reference a single class
  static bool isIOS = UniversalPlatform.isIOS;
  static bool isAndroid = UniversalPlatform.isAndroid;
  static bool isMacOS = UniversalPlatform.isMacOS;
  static bool isLinux = UniversalPlatform.isLinux;
  static bool isWindows = UniversalPlatform.isWindows;

  // Higher level device class abstractions (more syntax sugar for the views)
  static bool isWeb = kIsWeb;
  static bool get isDesktop => isWindows || isMacOS || isLinux;
  static bool get isMobile => isAndroid || isIOS;
  static bool get isDesktopOrWeb => isDesktop || isWeb;
  static bool get isMobileOrWeb => isMobile || isWeb;
}
