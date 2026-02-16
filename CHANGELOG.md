# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] - 2026-02-16

### Added
- Added Order Refunds API endpoints (list, create, get, delete refunds for orders)
- Added Coupons API endpoints (full CRUD + batch operations)
- Added Settings API endpoints (list groups, get/update settings)
- Added Shipping Zones API endpoints (full CRUD for shipping zones)
- Added Shipping Zone Locations API endpoints (list and update locations)
- Added Shipping Zone Methods API endpoints (full CRUD for shipping methods)
- Added Payment Gateways API endpoints (list, get, update gateways)
- Added Taxes API endpoints (full CRUD + batch operations)
- Added Tax Classes API endpoints (list, create, get by slug, delete)
- Added Webhooks API endpoints (full CRUD + batch operations)
- Added System Status API endpoints (get status, list tools, run tools)
- Added comprehensive schemas for all new resources (Coupon, SettingsGroup, Setting, ShippingZone, ShippingZoneLocation, ShippingZoneMethod, PaymentGateway, Tax, TaxClass, Webhook, SystemStatus, SystemStatusTool)
- Added extended OrderRefund schema with complete refund details
- Added new API tags for all additional resources
- Complete coverage of WooCommerce REST API v3 (24 resource types, 100+ endpoints)

## [0.9.8] - 2025-01-13

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