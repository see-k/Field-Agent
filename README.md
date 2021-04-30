# Field-Agent
____________________________________
# Ramsey County Tiny Theater Company (RCTTC)
### Dev10 Assessment: M06
#### by Chike Okonta
#### 04/26/2021
💻 Designed using MySQL Workbench 8.0 CE

_______________________________________________________
![iQFqp2Is](https://user-images.githubusercontent.com/40407778/115913154-d8a75900-a435-11eb-979a-b5a1cc493ec5.jpeg)

### Introduction
[Tiny Theaters](https://stage3talent.brightspace.com/d2l/le/content/6716/viewContent/3713/View)  
```diff
+ The Ramsey County Tiny Theater Company manages three tiny theaters in the Saint Paul Metro. 
+ Each theater runs their own schedule of performances. 
+ Currently, RCTTC tracks ticket purchases in a spreadsheet since reservations are always made in person or via a phone call to the one and only office manager. 
+ There's never a chance of double-selling a ticket.
+ RCTTC is ready for their next step in professional theater; they're moving their reservation system online. 
```
This is a relational database that manages RCTTC's data in a way that's technically sound and safe.
___________________________________________________
### High Level Requirements
 - Use RCTTC's data to design a multi-table schema with appropriate relationships.
 - Build a SQL DDL script to create the schema.
 - Populate the database with sample data from a delimited data file. Save the DML SQL so it can be executed whenever needed.
 - Write report queries and confirm they're working with sample data.
___________________________________________________
### Instructions
Use MySQL workbench 8.0 CE to run queries on the following files
- rcttc-schema.sql: re-runnable DDL
- rcttc-data.sql: data populating DML
- rcttc-queries.sql: queries

  
 ______________________________________________________________________
## Example
```diff
- Click image below to expand
```
![sample](https://user-images.githubusercontent.com/40407778/115920675-24f79680-a440-11eb-9779-ba72e08953b2.JPG)



Figure 3
____________________________________________________________________

## Project Management 
```diff
+ Use link below to go to project board
```
[Link to Public Trello Board: MO5 Mastery Project](https://trello.com/b/PTnqEPNP/m06-tiny-theaters)

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

   ______________________________________________________________________
## Entity Relations Chart
 ```diff
 + Click the link below to view UML chart in full page
 ```
[Link to full diagram](https://viewer.diagrams.net/?highlight=0000ff&edit=_blank&layers=1&nav=1&title=diagram.drawio#R7V1bc6M4Fv41rtp9GBd348fYiWdrJl0zle6p7ZmXKcUohg4GCpSL99evBJINSBhfMMgepVKJJZBA%2Bs75JJ1zJI%2FM%2Bfrz5xQk%2FpfYg%2BHI0LzPkXk%2FMgxdd038j%2BRsipyJ5RYZqzTwiixtl%2FE1%2BB%2BkJVnuW%2BDBjOYVWSiOQxQk1cxlHEVwiSp5IE3jj%2BptL3HoVTISsIJcxtclCPnc%2FwYe8lm7nOnuwn9gsPLpo11jUlx4BsvXVRq%2FRfR5I8NcWAv9%2FqG4vAasLtrQzAde%2FFHKMh9G5jyNY1R8Wn%2FOYUj6ttpti4ar2%2FdOYYQOKfDy42H9468%2Ffsl%2BWf%2F1%2FS6cIu2P%2BU%2B6U1TzDsI3yNqRvy3asB4ijUxG5uwljtA8DuM0zzbNqTm3HZxPa4Apgp8iyMAzq0nj31nf9gSWMBivIUo3%2BBZakWtS6aLCZUzsIv2xg8pggPgllAyHNgxQ8Vht6951Ef5Ae%2BmYHuM6bP6WIVx5ynUcRjwhH2kPzDIEUkQ1wNRwBu4gBIIIkh7V83QYgiQLig7Lc%2Fwg9B7BJn5DrCKWmr0En9B7KhSA3It14RFXRpIahesrfRlyGYTBKsKfl7jvyRNnKczwuzyCDG0rwMIMPVo%2Be4Vo6ZcqE2GfoTR%2BhaUrD9rkzl7kbxeGpfyFMZ%2B7i33SUpaKPbLKy8pwsmC0Kw%2BTAdw6FIDwiehDtMrFoYo26WUvjZNvIF1BRDOSOCBgPbzjntniWurYKI5ITShO6MUQvrCyzzHCYsmgpd2xrTTvCnuGf7FSzrWxPbLx685xWt%2Bl8S%2B5PcXQRxhpLKqkDogl5gMSqdkH%2F7Fk0Q6%2FGH3KDKZ2GDGw%2BzqXBZOThd9%2FPU4aymR5EtBaDeg6A8S421%2FCfAzyA8%2BDUc8IGq36y9DpBTGLQ2xJmfxvXA4Xxo0ZFkBG2cW9sywByyBaPRYlnRrCtrwIfzbqqD7tU0ftq%2BDruhTcJF87Q%2FP1ARPffpUdegGrTwaytuUi60kzWb8EKRZuci1d%2BiD9l2H%2FW3belhRcWXjaVTwtC09Ph%2BbpqeLpvfC5cvE0M%2BuJiDoEiqc7AVcWntZ5Y5gi6oGIWjeGZmr9XHPYrVO13oDgYFzN26y2XA3XIAgVWXcBrzRsvcfglfgEEgX3MXA3uCMY3OZYd0o%2FFGnG1rbFS4Njj12z9GMJhMO9lHDwtrGtcADPS2GWKfHoWDxqIjHlfZu6q42Zg70XMZieu9xSM7oOZIR5u01n6Cmdxi%2Fn1JyOVxiJ5nQavyZDwfIVoqtxaskKqTTzON4WzkE6YMyO4dRjdgQLU12gE4Z1sR7jDcp4QgPTd%2Bj9jXwIkAreqSlV98E7k1ae7FsormOqcyvROw2mzD3hOyJxuBipGvxER8XvCDVGnrmOwU916rR%2BNZMe2SJ5mrDeMwlye8X%2BXGOzWqh2x96iYJ5%2B2Zu3ZA%2Bs8JItU4v%2BkIi6eVv0diKurIzn4yoNTauQS3loWhTL0y9Nq6DLFnWWLOrS4E1NbGKtnEId4isNXavIS3noWhjR0y9fq%2BDLFn2WLPrS5K1YjK9VhEdn6MrC1qbA1UfRVuFbnXkoamgzcram4%2BnUtSe6ZeR%2FeVmwRbJgjY1SIeNScRwuTwRqIB9KdPSxXZUdVx%2BYOVyeOdTAzuuPPAO7y5u7E9xDcboG0RJejZdDVlj3jOhCFr%2FYptQDzGVDhnbY1ZBF250KiEwQr6izc1u6nwPxlv%2BSYjTqg4rq6CSqw2m3VwkHtgvKA%2B9YkHHicyNRHYX2HRPV0fMKiedTFdUh1Bh5pjom7yS4xqmObAEdTTDLMvUxD4hqlYC4b2TF2kLcgoCOnon7XEfErS9QzfZ42n5Zm3cVZD7unrkxulNWyPNxlYWmrXMjrRRNd0fTgoCOfmnaOne1des0bTUAONiZh%2FyCyAOI%2BAWLf4qcT0FTFnJ25D7N2baqO8NMwc4wsbnIuZg%2B8D32lG8hACiIo0Z9UObDbsyH7Sc6i%2BXBdseWvTsrgclV9%2BJxHYvSG7EmWvu3ww9uTbT4RamyJgo1RqIJD78uTXcEr6yJHcMsy0yIPUxy4r6RZWoLcR9qTbxYNJStwl1azgM%2BLdzlcoAZHGBXdza%2FrJgeSdGXw1hZEuWhaNcdeG5tK0tiizpLZkm0eUtieWJ9becvyAqvNBPqc7duKrbujq11fXC6PtcwdvN03W7a7JeupQuokJ%2BSW05wHZqSp%2BpshR6loclXsd2sKzy9t8f11FQdrtByrudphytcDjDB4QrqpNYuEJXFxOEcMOhCbwWZZR%2B3NkCbJxjma6iH3ZXC%2Fl%2F4mXXc4pmP1iFVKxh5d%2BR7sHHy4QnD%2FC3%2BAqJNcWERkBcunL%2FEVS2%2BsTtXMG5AuvnO1J8k%2FiSJsc2S95%2Fli%2FcblvoM0HfWHvy5VAqndoVIYlNuUKmBIXiG4Wz7pdzl1yu%2BlptJGunxRjmjWVn8li7hvskBlSPExsumG41W0tkesl1xcbPMNJeG9%2BobiySVPuP3OCcOpgMOM6XSccqa1r4MuWgpLbWTd66iSa0is15R0RNcRbnibBt%2Bhi4dcBbF5XTpAiqin6Yi2hEq0rNKmAeqxAHniF5WJxgvM51gm8aO1QlrUq3I1Gvb2i6sE%2BzxDSqAZ85%2BvIojEJbFf%2FlGDkhlw%2F02QIiIYyVAaFf6Mc6nDeSOHxChDVUe8IbiuvqcRv9N2lVRx7V4VDta%2F07Qo9rYSd%2FkogNQqxI1bWU%2BUzfqW3wnLICiRTdw74BN6Ta6ymt%2BjmYLn9OkavX7LRrruNOo4g061S9X5KJyQjIZ9nHPOivy6QmsM0iaPseoI%2FLhWxDl%2F7YHWs7jdUJkhpbF77IrzjITlnEP38khT9pdBrNsncvFHU5%2B0ZxS%2BaSx%2BEM%2B7uECbOjDH%2B8DsErB%2BqDyz3lT%2FOCVBAX%2F9kriGQ8qp2EOXZAD%2FhaGRsROVKTGVXi%2Bj6oEUlVnumgRrGPoUmRUBMPQ1LecpchJ3ubsww8Q%2FIrzyaM%2BUpA0rFZOCJA8aLmyPxDWqogy%2Bxq20vBniY752h4b0v3pEoLTWPOVKAeZCoA9NQD2uNBo8ckKve6kd6%2FDvHgjsa9uw%2FZcWWJfXd66qGJfhRojj8%2FHvXoDo2xhr00Iy%2BISctX5rfJw9uCb6N0DTGb%2FaI%2BQK9nxrWw%2FL0%2FYSRos812acBmsQSg7b8sKrCw8PT03IF3xdHc8Pfgu%2BqmheHq%2Fn7dh8TwYT%2FN2wQwCNFLnLXcAqjQcfePOlVNcl23umH4djsxC1eoraYoTOdhXcuZXMvN0PqgkHeBuo5RzrrOtX3lgX17f7ju7kDzgZBrHqOyESkHif4k9SO74Pw%3D%3D)
![diagram (3)](https://user-images.githubusercontent.com/40407778/115927861-bec44100-a44a-11eb-96bc-7e39d3e359f2.jpg)


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


