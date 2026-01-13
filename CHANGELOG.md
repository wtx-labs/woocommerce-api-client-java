# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.9.8] - 2025-01-15

### Fixed
- Fixed issue #8: Exclude null fields from JSON serialization to prevent WooCommerce API errors when optional fields are not set

## [0.9.0] - 2024-06-10

### Added
- Added GitHub Packages publishing workflow
- Added GitHub Actions for automated builds
- Added JUnit tests
- Added pom.xml optimizations
- Added security policy
- Added contributing guidelines
- Added code of conduct

### Changed
- Updated version number in README
- Improved API methods with optional parameters
- Enhanced code organization
- Updated project documentation
- Improved test coverage
- Enhanced logging capabilities
- Updated dependencies to latest versions

### Fixed
- Fixed ISSUE-1: Enforced sending the 'status' parameter as a comma-separated list of values
- Fixed date handling in order processing
- Fixed authentication header generation
- Fixed test response files naming 