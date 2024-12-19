# Database Schema Documentation

## 1. Users Table

| Column     | Type   | Constraints      |
|------------|--------|------------------|
| `id`       | Long   | Primary Key      |
| `name`     | String | Not Null         |
| `email`    | String | Unique, Not Null |
| `password` | String | Not Null         |
| `role`     | String | Not Null         |

## 2. Tenders Table

| Column        | Type          | Constraints          |
|---------------|---------------|----------------------|
| `id`          | Long          | Primary Key          |
| `title`       | String        | Not Null             |
| `description` | String        |                      |
| `status`      | String        | Not Null             |
| `created_by`  | Long          | Foreign Key to Users |
| `created_at`  | LocalDateTime | Not Null             |

## 3. Bids Table

| Column         | Type          | Constraints            |
|----------------|---------------|------------------------|
| `id`           | Long          | Primary Key            |
| `tender_id`    | Long          | Foreign Key to Tenders |
| `user_id`      | Long          | Foreign Key to Users   |
| `amount`       | Double        | Not Null               |
| `submitted_at` | LocalDateTime | Not Null               |

## Relationships

1. **Users ↔ Tenders**:
    - **One-to-Many**: A user can create multiple tenders.

2. **Tenders ↔ Bids**:
    - **One-to-Many**: A tender can have multiple bids.

3. **Users ↔ Bids**:
    - **One-to-Many**: A user can place multiple bids.

