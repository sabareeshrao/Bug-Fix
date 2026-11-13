# Java Bug Fix Curriculum

A separate learning sequence derived from [the 390-set source question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md).

## Principles

- Study debugging concepts in prerequisite order, not the original interview question order.
- Keep `reference/` unchanged and link back to original Sets when a challenge is related.
- Every lesson has a stable `BFX-###` ID and searchable in-code location marker.
- Every lesson includes original compilable Java 21 code, original **actual** output, expected output, a one-paragraph developer prompt that targets the defect, a -/+ patch, complete corrected code, corrected output, root cause and learning objective.
- Favor **behavioral** bugs (business logic, edge cases, data corruption, security, production) over punctuation or trivial compilation mistakes.
- Do not instruct the simulated AI to format code as a diff inside the developer prompt; that is the presentation format for the teaching platform, not a developer instruction.
- Keep separate counts for **published** lessons and **learner-verified** lessons. A published explanation is not evidence of learning.
- Before authoring `next lesson`, inspect the tracker and source questions; choose the next un-published ID, and never reuse the same primary bug concept.
- Preserve one lesson per file and one commit per lesson.

## Navigation

See [ROADMAP.md](ROADMAP.md), [TRACKER.md](TRACKER.md), and `lessons/`. The source archive remains independent of this curriculum.
