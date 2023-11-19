## TDD and Clean Architecture for Python MongoDB 
File Structure
```bash
|── /app
|   |──__init__.py
|   # Contains the API routes/endpoints
|   └──/api
|   |   |──__init__.py
|   |   └──/v1
|   |       |──__init__.py
|   |       └──/endpoints
|   |           |──__init__.py
|   |           └──dashboard.py
|   # Core configurations and utilities applicable across the entire application
|   |──/core
|   |   |──__init__.py
|   |   |──config.py           # Application configurations
|   |   |──exceptions.py       # Custom exception classes
|   |   └──utilities.py        # Common utility functions
|   # Business logic and use case implementations - what it does, what business problems it solves, and what logic it executes to achieve its goals
|   |──/services
|   |   |──__init__.py
|   |   |──analytics.py        # Business logic for data analytics
|   |   └──report_generator.py # Business logic for report generation
|   # Representation of a table in a database which mirrors the structure and relationships of the data in a database
|   |──/models
|   |   |──__init__.py
|   |   └──dashboard_model.py  # Define the Data (attributes and their data types), Methods and Relationships referencing MongoDB
|   |──/repositories
|   |   |──__init__.py
|   |   └──dashboard_repository.py # CRUD operations for dashboard data
|   # Structure of data that is sent to or received from an API and the format and type of data the clients expect to interact with
|   |──/schemas
|   |   |──__init__.py
|   |   └──dashboard_schema.py # Serialization and validation schemas (e.g., Pydantic models)
|   # Test suites, divided into unit and integration tests
|   |──/tests
|       |──__init__.py
|       |──/unit
|       └──/integration
|──requirements.txt
|──.env
|──main.py # Initialize and run the app
```