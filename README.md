____________________________________
# Field-Agent
### Dev10 Assessment: M07
#### by Chike Okonta
#### 04/30/2021

Designed using 
💾 MySQL Workbench 8.0 CE
💻 Intellij IDEA
🖥️ Visual Studio Code

_______________________________________________________
![k1eusL](https://user-images.githubusercontent.com/40407778/116723406-1f9ccd80-a9a5-11eb-9ed4-e6155ddc68c2.png)

### Introduction
[Field Agent](https://en.wikipedia.org/wiki/Field_agent)  
```diff
+ A field agent is an agent who works in the field as opposed to one who operates at the office or headquarters. 
+ Field agents can work alone or in a group but usually has a case officer who is in charge.
+ Field agents can be undercover, and travel using fake passports that may be under the name of a front organization or shell corporation.
```
___________________________________________________
### High Level Requirements
 - Create full HTTP CRUD for security clearance.
 - Create full HTTP CRUD for agent aliases.
 - Implement global error handling.
___________________________________________________
### Instructions
Use MySQL workbench 8.0 CE to run queries on the following files
- field-agent-schema-prod.sql
- field-agent-schema-test.sql

Use Visual Studio code to send HTTP requests using the file below
- demoScript.http

To launch server
- compile the program -->javac App.java
- launch the program --> java App

#### Code Sequence Steps:
[ ] Step 1
[ ] Step 1
[ ] Step 1
[ ] Step 1
 ______________________________________________________________________

## Entity Relations Chart
 ```diff
 + Click to view UML chart in full page
 ```
![mpk](https://user-images.githubusercontent.com/40407778/116732632-b622bc00-a9b0-11eb-99bc-1383eec13f76.JPG)
______________________________________________________________________
## Example of Sequence Chart
```diff
- Click image below to expand
```
![mn b n](https://user-images.githubusercontent.com/40407778/116732898-faae5780-a9b0-11eb-9e1e-f2493a3e2ebb.JPG)

Figure 3
____________________________________________________________________

## Project Management 
```diff
+ Use link below to go to project board
```
[Link to Public Trello Board: MO7 Mastery Project](https://trello.com/b/JA7GwaAX/m07)

## Time Tracker

|DATE |TASK ID|ESTIMATED TIME (HRS) | START TIME (HRS:MINS)|END TIME (HRS:MINS)| STATUS
|:---:| :---: | :---:               | :---:                |:---:              |:---:
|4.23.2021| Step 1: DDL - Research on denormalized data| 2              | _ | _ | In progress
|4.23.2021| Step 1: DDL - Planning and diagrams  | 4              | 12:00 PM | 4:00 PM | Completed
|4.24.2021| Step 2: DML - Insert | 2              | _  | _ | Not Started
|4.24.2021| Step 2: DML - Update | 2                 | _  | _ | Not Started
|4.24.2021| Step 2: DML - Delete | 2      | _  | _ | Not Started
|4.24.2021| Step 3: DQL- Complete all queries | 3          | _  | _ | Not Started
|4.25.2021| Stretch Goal #1 | 2       | _  | _ | Not Started
|4.25.2021| Stretch Goal #2 | 2      | _  | _ | Not Started
|4.25.2021| Bugs and Errors: find and fix #1 | 1  | _  | _ | Not Started

Table 1
 ________________________________________________________

### Glossary
The Performances - The 2021 schedule:
- High School Musical
- Hair
- Dance, Dance Vertical: dance performed on a vertical surface using climbing equipment.
- Caddyshack
- Burr: the real dirt on Alexander Hamilton
- Send in the Clowns
- The Dress
- Tell Me What To Think
- The Sky Lit Up: cosmic horror
- Ocean: the life of Frank Ocean as performed by Frank Ocean
- Stop. Just Stop.
- Wen

#### Data Information
  
  |DATA| TYPE
  | :---:|:---:
  |`Customer Last Name`| `varchar`
  | `Customer First Name` |`varchar`
  | `Customer Email` |`varchar`
  | `Customer Phone` |`varchar`
  | `Customer Address` |`varchar`
  | `Seat` |`varchar`
  | `Show` |`varchar`
  | `Ticket price` |`decimal`
  | `Date` |`date`
  | `Theater` |`varchar`
  | `Theater address` |`varchar`
  | `Theater phone` |`varchar`
  | `Ticket email` |`varchar`

Table 2


