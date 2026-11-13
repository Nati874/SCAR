# SCAR

**SIT Class & Asset Reservation**

SCAR is a Java application planned for managing classroom and asset reservations at SIT.

## Project structure

```text
SCAR/
├── docs/                         # Project documentation and design notes
├── src/
│   ├── main/
│   │   ├── java/com/scar/
│   │   │   ├── controller/       # Application flow and request coordination
│   │   │   ├── exception/        # Domain-specific exceptions
│   │   │   ├── model/            # Domain entities and value objects
│   │   │   ├── repository/       # Data access abstractions
│   │   │   ├── service/          # Business rules and use cases
│   │   │   ├── ui/               # User interface and presentation flow
│   │   │   └── util/             # Shared utilities
│   │   └── resources/            # Runtime configuration and static resources
│   └── test/java/com/scar/       # Automated tests
└── pom.xml                       # Maven project configuration
```

## Planned scope

- Classroom reservation management
- Asset reservation management
- Availability and conflict checking
- Reservation lifecycle handling
- Role-aware access for relevant users

## Technology

- Java
- Maven

## Status

Project structure only. No application implementation has been added yet.

## Project Team
- Beamlak Siraw Asmare
- Getnet Tujuba Ararsa
- Guluma Hailu Kitila
- Miraj Abdenur Ahmed
- Nardos Takele
- Nathnael Ayizohibel Adamu 

