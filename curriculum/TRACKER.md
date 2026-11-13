# Java Bug Fix — Lesson Publication and Mastery Tracker

**Rule:** This tracker records what content exists, **not** what the learner has personally mastered. `Published` indicates a lesson file was created. `Verified` requires explicit learner confirmation. Source bank's earlier Developer-7 progress (85/387+) is unrelated and must never be imported as completion here.

- **Published:** 3 / 130
- **Verified by learner:** 0 / 130 (none confirmed)
- **Next lesson:** **BFX-004** — Empty array produces unexpected result
- **Read this before every “next lesson” request.** Update the specific status row after publishing. Never select an ID with a published lesson file.

| Lesson ID | Phase | Primary concept (unique) | Topic | Publication | Learner verified |
|---|---|---|---|---|---|
| [BFX-001](lessons/BFX-001-average-integer-division.md) | 01 | `integer-division` | Integer division loses decimal precision | Published | No |
| [BFX-002](lessons/BFX-002-cart-total-accumulation.md) | 01 | `running-total-accumulation` | Cart total overwritten in loop | Published | No |
| [BFX-003](lessons/BFX-003-array-index-boundary.md) | 01 | `array-off-by-one` | Array index at the boundary | Published | No |
| BFX-004 | 01 | `empty-input-handling` | Empty array produces unexpected result | Planned | No |
| BFX-005 | 01 | `condition-ordering` | Incorrect if/else branch ordering | Planned | No |
| BFX-006 | 01 | `boolean-precedence` | AND/OR logic accepts invalid input | Planned | No |
| BFX-007 | 01 | `loop-control` | Continue skips a required update | Planned | No |
| BFX-008 | 01 | `switch-fallthrough` | Traditional switch accidental fall-through | Planned | No |
| BFX-009 | 01 | `integer-overflow` | Integer arithmetic overflows | Planned | No |
| BFX-010 | 01 | `loop-termination` | Wrong loop termination condition | Planned | No |
| BFX-011 | 02 | `string-equality` | Strings compared by identity | Planned | No |
| BFX-012 | 02 | `null-string-input` | Null input reaches a String method | Planned | No |
| BFX-013 | 02 | `substring-bounds` | Substring endpoint miscalculated | Planned | No |
| BFX-014 | 02 | `blank-vs-empty` | Blank and empty input confused | Planned | No |
| BFX-015 | 02 | `stringbuilder-reuse` | StringBuilder state reused incorrectly | Planned | No |
| BFX-016 | 02 | `whitespace-normalization` | Whitespace normalization missed | Planned | No |
| BFX-017 | 02 | `number-format-validation` | Numeric parsing ignores invalid values | Planned | No |
| BFX-018 | 02 | `character-encoding` | Text decoded with wrong charset | Planned | No |
| BFX-019 | 02 | `regex-escaping` | Regex escaping changes matching behavior | Planned | No |
| BFX-020 | 02 | `sensitive-string-logging` | Sensitive text appears in logs | Planned | No |
| BFX-021 | 03 | `field-shadowing` | Constructor parameter hides a field | Planned | No |
| BFX-022 | 03 | `mutable-static-state` | Static state shared between customers | Planned | No |
| BFX-023 | 03 | `object-invariant` | Object invariant not enforced | Planned | No |
| BFX-024 | 03 | `override-vs-overload` | Override silently uses overload | Planned | No |
| BFX-025 | 03 | `defensive-copy` | Mutable object breaks expected immutability | Planned | No |
| BFX-026 | 03 | `equals-hashcode-contract` | Custom identity violates equals/hashCode | Planned | No |
| BFX-027 | 03 | `comparator-contract` | Comparator returns inconsistent ordering | Planned | No |
| BFX-028 | 03 | `enum-exhaustiveness` | Enum branch lacks a safe default | Planned | No |
| BFX-029 | 03 | `initialization-order` | Inheritance initialization order surprises | Planned | No |
| BFX-030 | 03 | `record-validation` | Java record accepts invalid state | Planned | No |
| BFX-031 | 04 | `concurrent-modification-iteration` | List removal fails while iterating | Planned | No |
| BFX-032 | 04 | `hashset-duplicates` | HashSet retains logically duplicate objects | Planned | No |
| BFX-033 | 04 | `mutable-map-key` | Mutable HashMap key becomes unfindable | Planned | No |
| BFX-034 | 04 | `hashmap-overwrite` | Map put replaces a previous value | Planned | No |
| BFX-035 | 04 | `map-merge-semantics` | Map merge drops quantities | Planned | No |
| BFX-036 | 04 | `insertion-order` | De-duplication destroys display order | Planned | No |
| BFX-037 | 04 | `sorted-set-comparator` | Sorted collection drops distinct keys | Planned | No |
| BFX-038 | 04 | `sorting-direction` | Sorting changes expected ranking | Planned | No |
| BFX-039 | 04 | `list-copy-vs-alias` | List copy aliases original storage | Planned | No |
| BFX-040 | 04 | `unmodifiable-view` | Unmodifiable view exposed as mutable state | Planned | No |
| BFX-041 | 05 | `swallowed-exception` | Caught exception is silently swallowed | Planned | No |
| BFX-042 | 05 | `finally-masks-exception` | Finally hides the original error | Planned | No |
| BFX-043 | 05 | `catch-specificity` | Exception handler catches too broadly | Planned | No |
| BFX-044 | 05 | `try-with-resources` | Unclosed file leaves resource leak | Planned | No |
| BFX-045 | 05 | `exception-cause-chain` | Cause lost when wrapping exceptions | Planned | No |
| BFX-046 | 05 | `assertion-quality` | JUnit assertion misses wrong behavior | Planned | No |
| BFX-047 | 05 | `boundary-test-design` | Missing boundary test lets bug ship | Planned | No |
| BFX-048 | 05 | `mockito-stubbing` | Mockito stub never matches arguments | Planned | No |
| BFX-049 | 05 | `deterministic-testing` | Time-dependent test fails intermittently | Planned | No |
| BFX-050 | 05 | `async-exception-testing` | Async task exception escapes visibility | Planned | No |
| BFX-051 | 06 | `stream-operation-order` | Stream transformations execute in wrong order | Planned | No |
| BFX-052 | 06 | `stream-single-use` | A Stream is reused after a terminal action | Planned | No |
| BFX-053 | 06 | `grouping-by-key` | Grouping uses the wrong key | Planned | No |
| BFX-054 | 06 | `duplicate-map-keys` | toMap fails when keys repeat | Planned | No |
| BFX-055 | 06 | `optional-eager-default` | Optional default executes unnecessarily | Planned | No |
| BFX-056 | 06 | `optional-empty-handling` | Optional.get triggers empty-value failure | Planned | No |
| BFX-057 | 06 | `parallel-stream-side-effects` | Parallel Stream mutates shared state | Planned | No |
| BFX-058 | 06 | `csv-quoted-fields` | CSV parser breaks quoted commas | Planned | No |
| BFX-059 | 06 | `serialization-compatibility` | Serialized data breaks after class evolution | Planned | No |
| BFX-060 | 06 | `locale-number-format` | Locale changes numeric text parsing | Planned | No |
| BFX-061 | 07 | `join-cardinality` | SQL join duplicates order rows | Planned | No |
| BFX-062 | 07 | `update-predicate` | Update modifies rows beyond the target | Planned | No |
| BFX-063 | 07 | `parameterized-query` | SQL query concatenates untrusted input | Planned | No |
| BFX-064 | 07 | `transaction-rollback` | Transaction commits incomplete work | Planned | No |
| BFX-065 | 07 | `referential-integrity` | Foreign key handling breaks inserts | Planned | No |
| BFX-066 | 07 | `lazy-loading-boundary` | Lazy entity access fails outside session | Planned | No |
| BFX-067 | 07 | `n-plus-one-queries` | N+1 queries overload database | Planned | No |
| BFX-068 | 07 | `stable-pagination-order` | Pagination produces duplicate/missing rows | Planned | No |
| BFX-069 | 07 | `optimistic-locking` | Concurrent update loses database version | Planned | No |
| BFX-070 | 07 | `index-selection` | Missing index slows filtered lookup | Planned | No |
| BFX-071 | 08 | `request-mapping` | Endpoint mapped to the wrong path | Planned | No |
| BFX-072 | 08 | `request-binding` | Request DTO silently binds incorrect fields | Planned | No |
| BFX-073 | 08 | `bean-validation` | Missing validation lets invalid payload through | Planned | No |
| BFX-074 | 08 | `http-error-semantics` | Missing resource incorrectly returns 500 | Planned | No |
| BFX-075 | 08 | `global-exception-response` | Exception response leaks technical details | Planned | No |
| BFX-076 | 08 | `patch-semantics` | PATCH null erases unchanged values | Planned | No |
| BFX-077 | 08 | `json-serialization` | JSON serializer triggers unintended behavior | Planned | No |
| BFX-078 | 08 | `bean-scope` | Bean scope leaks request-specific state | Planned | No |
| BFX-079 | 08 | `configuration-profiles` | Wrong Spring profile chooses bad configuration | Planned | No |
| BFX-080 | 08 | `spring-circular-dependency` | Circular dependency prevents startup | Planned | No |
| BFX-081 | 09 | `authentication-gap` | Endpoint skips authentication path | Planned | No |
| BFX-082 | 09 | `authorization-boundary` | Role check allows excessive permissions | Planned | No |
| BFX-083 | 09 | `object-level-authorization` | Object ID can access another user's data | Planned | No |
| BFX-084 | 09 | `cors-policy` | CORS policy permits unexpected origins | Planned | No |
| BFX-085 | 09 | `token-expiry` | Expired token is still accepted | Planned | No |
| BFX-086 | 09 | `secret-redaction` | Credentials leak into application logs | Planned | No |
| BFX-087 | 09 | `transaction-boundary` | Transaction boundary ends too early | Planned | No |
| BFX-088 | 09 | `cache-invalidation` | Cache serves stale updated data | Planned | No |
| BFX-089 | 09 | `idempotency-key` | Repeated POST creates duplicate orders | Planned | No |
| BFX-090 | 09 | `untrusted-upload` | Uploaded file bypasses content validation | Planned | No |
| BFX-091 | 10 | `race-condition` | Counter increments lost across threads | Planned | No |
| BFX-092 | 10 | `lock-scope` | Synchronization uses the wrong monitor | Planned | No |
| BFX-093 | 10 | `deadlock-ordering` | Lock acquisition order deadlocks | Planned | No |
| BFX-094 | 10 | `thread-pool-exhaustion` | Thread pool starves incoming work | Planned | No |
| BFX-095 | 10 | `future-timeout` | Future blocks without timeout | Planned | No |
| BFX-096 | 10 | `shared-map-thread-safety` | Shared HashMap corrupts concurrent workflow | Planned | No |
| BFX-097 | 10 | `threadlocal-cleanup` | ThreadLocal context leaks across requests | Planned | No |
| BFX-098 | 10 | `volatile-not-atomic` | Volatile assumed to make increments atomic | Planned | No |
| BFX-099 | 10 | `future-exception-propagation` | CompletableFuture error goes unobserved | Planned | No |
| BFX-100 | 10 | `safe-publication` | Lazy singleton publishes unsafely | Planned | No |
| BFX-101 | 11 | `cross-service-retry` | Retry duplicates a cross-service payment | Planned | No |
| BFX-102 | 11 | `timeout-propagation` | Missing timeout cascades failures | Planned | No |
| BFX-103 | 11 | `circuit-breaker-configuration` | Circuit breaker counts wrong failures | Planned | No |
| BFX-104 | 11 | `message-acknowledgment` | Kafka consumer acknowledges before processing | Planned | No |
| BFX-105 | 11 | `consumer-offset` | Consumer starts from incorrect offset | Planned | No |
| BFX-106 | 11 | `dead-letter-queue` | Poison message blocks the queue | Planned | No |
| BFX-107 | 11 | `saga-compensation` | Saga compensation misses partial failure | Planned | No |
| BFX-108 | 11 | `transactional-outbox` | DB write succeeds but event is lost | Planned | No |
| BFX-109 | 11 | `contract-backward-compatibility` | New API response breaks old consumers | Planned | No |
| BFX-110 | 11 | `eventual-consistency` | Eventually consistent read appears stale | Planned | No |
| BFX-111 | 12 | `dependency-conflict` | Maven resolves incompatible library versions | Planned | No |
| BFX-112 | 12 | `ci-environment-drift` | CI passes locally but fails in pipeline | Planned | No |
| BFX-113 | 12 | `container-configuration` | Container omits required configuration | Planned | No |
| BFX-114 | 12 | `deployment-profile` | Production deploy picks wrong environment | Planned | No |
| BFX-115 | 12 | `healthcheck-readiness` | Health checks mark broken app healthy | Planned | No |
| BFX-116 | 12 | `correlation-id` | Logs cannot connect one request across calls | Planned | No |
| BFX-117 | 12 | `production-query-plan` | Slow production query escapes staging | Planned | No |
| BFX-118 | 12 | `listener-memory-leak` | Retained listeners cause Java heap growth | Planned | No |
| BFX-119 | 12 | `memory-pressure` | Traffic burst causes OutOfMemoryError | Planned | No |
| BFX-120 | 12 | `release-regression` | Post-release change breaks old workflows | Planned | No |
| BFX-121 | 13 | `lock-contention-under-load` | Load test reveals non-linear lock contention | Planned | No |
| BFX-122 | 13 | `cache-stampede` | Hot key triggers cache stampede | Planned | No |
| BFX-123 | 13 | `migration-resumability` | Data migration skips resumable checkpoint | Planned | No |
| BFX-124 | 13 | `rolling-upgrade-compatibility` | Rolling rollout breaks mixed-version traffic | Planned | No |
| BFX-125 | 13 | `distributed-consistency` | Distributed business operation loses consistency | Planned | No |
| BFX-126 | 13 | `observability-pii` | Observability pipeline exposes personal data | Planned | No |
| BFX-127 | 13 | `slo-error-budget` | Missing SLO alert hides customer-facing errors | Planned | No |
| BFX-128 | 13 | `tenant-isolation` | Tenant boundary leaks other-customer data | Planned | No |
| BFX-129 | 13 | `distributed-tracing` | Distributed trace misses the real root cause | Planned | No |
| BFX-130 | 13 | `incident-rollback` | P1 recovery fails to restore service safely | Planned | No |

## Next-lesson algorithm

1. Read this file on `main` and inspect the lesson directory for consistency.
2. Pick the first row marked `Planned` (currently `BFX-004`).
3. Read that phase's original source sets from the [390-set roadmap](../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md). Use the original question as inspiration when relevant, but never call a synthetic scenario a verbatim original.
4. Author a new **behavioral** bug with a stable comment marker and realistic output. Avoid repeating any earlier primary concept key.
5. Publish one lesson Markdown file in a separate commit. Update only that row and the published count/next ID; never mark mastery verified unless the user confirms it.
