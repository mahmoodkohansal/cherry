# Cherry
Open Source Test Management Software

## Description
Cherry is free and open-source test management software developed in Java and ReactJs
 for small or medium-sized teams to manage their test scenarios.

## Architecture
##### Entities
| User |
| ------- |
| first_name |
| last_name |
| username |

| Suite |
| ------- |
| name |
| description |
| pre_conditions |
| parent_suite < Suite > |
| cases < Case[] > |

| Case |
| ------- |
| title |
| description |
| status |
| severity |
| priority |
| type |
| behaviour |
| automation_status |
| milestone < Milestone > |
| suite < Suite > |
| pre_conditions |
| post_conditions |
| reproduce_steps < CaseStep[] > |
| tags < Tag > |

| CaseStep |
| ------- |
| order |
| action |
| input_data |
| expected_result |

| TestPlan |
| ------- |
| title |
| description |
| cases < Case[] > + assignee |

| TestRun |
| ------- |
| title |
| description |
| plan < TestPlan > |
| milestone < Milestone > |
| default_assignee < User > |
| tags < Tag[] > |
| cases < Case[] > + results |

| Tag |
| ------- |
| title |

| Project |
| ------- |
| title |
| code |
| description |
| access_type |
| icon < File > |
| members < User[] > |
| milestones < Milestone[] > |
| test_runs < TestRun[] > |

| Milestone |
| ------- |
| title |
| description |
| status (active / completed) |
| due_date |

| File |
| ------- |
| url |

| Defect |
| ------- |
| title |
| actual_result |
| case < Case > |
| milestone < Milestone > |
| severity |
| assignee < User > |
| tags < Tag [] > |
| attachments < File[] > |
| comments < Note > |

| Note |
| ------- |
| notable_entity |
| notable_id |

## Contribute
Cherry is an open source project and we are very happy to accept community contributions. 

## Credits


## License
Licensed under the MIT license.
