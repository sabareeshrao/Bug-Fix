# Zero-to-Hero Java Bug Fix Curriculum — 130 Lessons

> **Source of truth:** [390 existing interview sets](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md) on `main` and `batch-1-level-1`. Original set numbers remain unchanged. These 130 exercises are a **derived debugging path**, not a rewrite or complete one-to-one replacement of the 390 sets.

## Teaching rules

1. **Prerequisites first.** Follow BFX-001 → BFX-130, not numeric source-set order. Progress from simple execution defects through enterprise incident response.
2. **One primary concept per lesson.** Every ID below has a unique concept key. A previously taught idea may be reused in richer scenarios, but do not republish the same primary bug concept.
3. **Real defects over trivial punctuation.** Prefer runnable Java 21 code with an observable wrong result, silent data error, thrown exception, failing test or reproducible production symptom. Avoid fabricated semicolon/bracket/spelling mistakes.
4. **Keep the simulation developer-realistic.** Developer's AI prompt is one concise paragraph naming the file, method/marker, observed vs expected behavior, and scope of change, without revealing the fix or asking for a GitHub-style diff.
5. **Standard lesson anatomy.** Original buggy code with searchable `// ID: section`; original actual output (or actual exception); expected; developer prompt; `diff` removed/added lines; complete corrected code; corrected output; concise reason; optional regression/self-check. For multi-file incidents, show relevant file paths and comments.
6. **Don't confuse teaching with mastery.** `Published` means an explanation exists. `Learner verified` requires an explicit user confirmation; publication by itself never proves mastery.
7. **Protect original materials.** Do not modify anything in `reference/`, and do not rewrite the existing batch branches. Publish new lesson Markdown files only in `curriculum/lessons/`.
8. **GitHub progression.** For “next lesson”, read [TRACKER.md](TRACKER.md), select the first `Planned` ID in order, create one lesson file, update its tracker row to `Published`, and give the lesson URL and commit SHA. Each lesson gets a separate commit.

## Stages

### Phase 01 — Java Execution and Core Logic

**Level:** Zero → Beginner · **Related original roadmap Sets:** 1, 2, 5, 20, 35. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-001 — Integer division loses decimal precision
- BFX-002 — Cart total overwritten in loop
- BFX-003 — Array index at the boundary
- BFX-004 — Empty array produces unexpected result
- BFX-005 — Incorrect if/else branch ordering
- BFX-006 — AND/OR logic accepts invalid input
- BFX-007 — Continue skips a required update
- BFX-008 — Traditional switch accidental fall-through
- BFX-009 — Integer arithmetic overflows
- BFX-010 — Wrong loop termination condition

### Phase 02 — Strings, Text and Input

**Level:** Beginner · **Related original roadmap Sets:** 4, 10, 50, 51, 252. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-011 — Strings compared by identity
- BFX-012 — Null input reaches a String method
- BFX-013 — Substring endpoint miscalculated
- BFX-014 — Blank and empty input confused
- BFX-015 — StringBuilder state reused incorrectly
- BFX-016 — Whitespace normalization missed
- BFX-017 — Numeric parsing ignores invalid values
- BFX-018 — Text decoded with wrong charset
- BFX-019 — Regex escaping changes matching behavior
- BFX-020 — Sensitive text appears in logs

### Phase 03 — Objects and Domain Modeling

**Level:** Beginner → Junior · **Related original roadmap Sets:** 5, 6, 7, 8, 9, 10, 11, 12, 38. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-021 — Constructor parameter hides a field
- BFX-022 — Static state shared between customers
- BFX-023 — Object invariant not enforced
- BFX-024 — Override silently uses overload
- BFX-025 — Mutable object breaks expected immutability
- BFX-026 — Custom identity violates equals/hashCode
- BFX-027 — Comparator returns inconsistent ordering
- BFX-028 — Enum branch lacks a safe default
- BFX-029 — Inheritance initialization order surprises
- BFX-030 — Java record accepts invalid state

### Phase 04 — Arrays, Collections and Generics

**Level:** Junior · **Related original roadmap Sets:** 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32, 33, 34, 35, 38. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-031 — List removal fails while iterating
- BFX-032 — HashSet retains logically duplicate objects
- BFX-033 — Mutable HashMap key becomes unfindable
- BFX-034 — Map put replaces a previous value
- BFX-035 — Map merge drops quantities
- BFX-036 — De-duplication destroys display order
- BFX-037 — Sorted collection drops distinct keys
- BFX-038 — Sorting changes expected ranking
- BFX-039 — List copy aliases original storage
- BFX-040 — Unmodifiable view exposed as mutable state

### Phase 05 — Exceptions, Testing and Debugger Workflow

**Level:** Junior · **Related original roadmap Sets:** 13, 14, 15, 16, 17, 18, 19, 91, 92, 93, 94, 95, 98, 99, 102, 105, 109, 114. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-041 — Caught exception is silently swallowed
- BFX-042 — Finally hides the original error
- BFX-043 — Exception handler catches too broadly
- BFX-044 — Unclosed file leaves resource leak
- BFX-045 — Cause lost when wrapping exceptions
- BFX-046 — JUnit assertion misses wrong behavior
- BFX-047 — Missing boundary test lets bug ship
- BFX-048 — Mockito stub never matches arguments
- BFX-049 — Time-dependent test fails intermittently
- BFX-050 — Async task exception escapes visibility

### Phase 06 — Streams, Optional, Files and Serialization

**Level:** Junior → Mid · **Related original roadmap Sets:** 39, 40, 41, 42, 43, 44, 45, 50, 51, 52, 53, 54, 55. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-051 — Stream transformations execute in wrong order
- BFX-052 — A Stream is reused after a terminal action
- BFX-053 — Grouping uses the wrong key
- BFX-054 — toMap fails when keys repeat
- BFX-055 — Optional default executes unnecessarily
- BFX-056 — Optional.get triggers empty-value failure
- BFX-057 — Parallel Stream mutates shared state
- BFX-058 — CSV parser breaks quoted commas
- BFX-059 — Serialized data breaks after class evolution
- BFX-060 — Locale changes numeric text parsing

### Phase 07 — SQL, PostgreSQL and Persistence

**Level:** Mid · **Related original roadmap Sets:** 153, 154, 158, 159, 160, 162, 165, 166, 167, 168, 179, 230, 231, 232, 233, 234, 235, 237. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-061 — SQL join duplicates order rows
- BFX-062 — Update modifies rows beyond the target
- BFX-063 — SQL query concatenates untrusted input
- BFX-064 — Transaction commits incomplete work
- BFX-065 — Foreign key handling breaks inserts
- BFX-066 — Lazy entity access fails outside session
- BFX-067 — N+1 queries overload database
- BFX-068 — Pagination produces duplicate/missing rows
- BFX-069 — Concurrent update loses database version
- BFX-070 — Missing index slows filtered lookup

### Phase 08 — Spring Boot and REST APIs

**Level:** Mid · **Related original roadmap Sets:** 169, 170, 174, 175, 176, 186, 187, 188, 196, 197, 202, 211, 212, 213, 214, 218, 221, 222, 225, 229, 230. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-071 — Endpoint mapped to the wrong path
- BFX-072 — Request DTO silently binds incorrect fields
- BFX-073 — Missing validation lets invalid payload through
- BFX-074 — Missing resource incorrectly returns 500
- BFX-075 — Exception response leaks technical details
- BFX-076 — PATCH null erases unchanged values
- BFX-077 — JSON serializer triggers unintended behavior
- BFX-078 — Bean scope leaks request-specific state
- BFX-079 — Wrong Spring profile chooses bad configuration
- BFX-080 — Circular dependency prevents startup

### Phase 09 — Security, Transactions and Cache

**Level:** Mid → Senior · **Related original roadmap Sets:** 179, 184, 238, 239, 240, 241, 245, 247, 248, 249, 252, 253, 254, 255, 256, 311, 312, 313, 314, 387. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-081 — Endpoint skips authentication path
- BFX-082 — Role check allows excessive permissions
- BFX-083 — Object ID can access another user's data
- BFX-084 — CORS policy permits unexpected origins
- BFX-085 — Expired token is still accepted
- BFX-086 — Credentials leak into application logs
- BFX-087 — Transaction boundary ends too early
- BFX-088 — Cache serves stale updated data
- BFX-089 — Repeated POST creates duplicate orders
- BFX-090 — Uploaded file bypasses content validation

### Phase 10 — Concurrency and Thread Safety

**Level:** Senior · **Related original roadmap Sets:** 63, 64, 65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 78, 79, 80, 81, 82. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-091 — Counter increments lost across threads
- BFX-092 — Synchronization uses the wrong monitor
- BFX-093 — Lock acquisition order deadlocks
- BFX-094 — Thread pool starves incoming work
- BFX-095 — Future blocks without timeout
- BFX-096 — Shared HashMap corrupts concurrent workflow
- BFX-097 — ThreadLocal context leaks across requests
- BFX-098 — Volatile assumed to make increments atomic
- BFX-099 — CompletableFuture error goes unobserved
- BFX-100 — Lazy singleton publishes unsafely

### Phase 11 — Microservices and Messaging

**Level:** Senior · **Related original roadmap Sets:** 257, 258, 259, 260, 261, 262, 263, 264, 267, 269, 270, 271, 272, 276, 279, 280, 281, 388. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-101 — Retry duplicates a cross-service payment
- BFX-102 — Missing timeout cascades failures
- BFX-103 — Circuit breaker counts wrong failures
- BFX-104 — Kafka consumer acknowledges before processing
- BFX-105 — Consumer starts from incorrect offset
- BFX-106 — Poison message blocks the queue
- BFX-107 — Saga compensation misses partial failure
- BFX-108 — DB write succeeds but event is lost
- BFX-109 — New API response breaks old consumers
- BFX-110 — Eventually consistent read appears stale

### Phase 12 — Builds, CI/CD and Production Operations

**Level:** Senior · **Related original roadmap Sets:** 116, 117, 119, 120, 122, 123, 125, 127, 143, 144, 145, 147, 158, 203, 204, 205, 294, 296, 297, 298, 304, 305, 306, 309, 310, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-111 — Maven resolves incompatible library versions
- BFX-112 — CI passes locally but fails in pipeline
- BFX-113 — Container omits required configuration
- BFX-114 — Production deploy picks wrong environment
- BFX-115 — Health checks mark broken app healthy
- BFX-116 — Logs cannot connect one request across calls
- BFX-117 — Slow production query escapes staging
- BFX-118 — Retained listeners cause Java heap growth
- BFX-119 — Traffic burst causes OutOfMemoryError
- BFX-120 — Post-release change breaks old workflows

### Phase 13 — Senior Incident Response and Architecture

**Level:** Senior → Staff · **Related original roadmap Sets:** 279, 280, 281, 284, 285, 286, 315, 318, 319, 320, 321, 322, 323, 324, 362, 366, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 390. Source links point to the [unchanged complete question bank](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Only selected sets are cited; this is not an assertion that all source questions are completed.

- BFX-121 — Load test reveals non-linear lock contention
- BFX-122 — Hot key triggers cache stampede
- BFX-123 — Data migration skips resumable checkpoint
- BFX-124 — Rolling rollout breaks mixed-version traffic
- BFX-125 — Distributed business operation loses consistency
- BFX-126 — Observability pipeline exposes personal data
- BFX-127 — Missing SLO alert hides customer-facing errors
- BFX-128 — Tenant boundary leaks other-customer data
- BFX-129 — Distributed trace misses the real root cause
- BFX-130 — P1 recovery fails to restore service safely

## Advancement gates

After every 10 lessons, write a new regression-style exercise combining skills from that phase without counting it as a new unique concept. Do not create a new lesson ID for a practice-only review. A gate is a suggestion, not proof of mastery.

**Current publishing checkpoint:** BFX-001, BFX-002 and BFX-003 are published; **next:** BFX-004 — Empty array produces unexpected result. User mastery has not been assessed.
