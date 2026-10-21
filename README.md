# Bug-Fix — Original reference archive

This repository preserves **unaltered source references** for future Java debugging interview challenges. Do not place injected bugs, fixes, generated tests, or altered questions under `reference/`.

## Shopizer original code

- Location: [reference/shopizer](reference/shopizer)
- Upstream: https://github.com/shopizer-ecommerce/shopizer
- Source branch at capture: `3.2.7`
- Pinned upstream Git commit: `6a4a0a65a3408ee8f62597b51d1b3aac24b77dee`
- Source files verified against upstream Git blobs: **1,340 / 1,340** (including binary resource files)
- Upstream license retained at [reference/shopizer/LICENSE.md](reference/shopizer/LICENSE.md)

## Developer-7 original interview questions

- Complete roadmap: [All 390 sets](reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md)
- Four split Markdown source files: [Sets 1–105](reference/developer-7/docs/questions/roadmap/SETS_001_105.md), [106–205](reference/developer-7/docs/questions/roadmap/SETS_106_205.md), [206–305](reference/developer-7/docs/questions/roadmap/SETS_206_305.md), [306–390](reference/developer-7/docs/questions/roadmap/SETS_306_390.md)
- Original 387 job-experience questions: [question bank](reference/developer-7/questions/README.md)
- Additional nine original prompts without standalone sets: [appendix](reference/developer-7/docs/questions/roadmap/ORIGINAL_ANCHORS_NOT_ASSIGNED_SETS.md)
- Current editorial/coverage audit: [post-title audit](reference/developer-7/docs/questions/roadmap/QUESTION_AUDIT_POST_TITLE_UPDATE.md)
- Upstream: https://github.com/sabareeshrao/Developer-7
- Pinned upstream Git commit: `d113cb8969e5cf55c2b4da470ec61d2aa1391935`
- Source files verified against upstream Git blobs: **14 / 14**
- In the numbered roadmap: **390 main question anchors + 3,590 technical-question appearances = 3,980 question placements**. Repeated questions remain preserved as in the original.

## Reference preservation rule

The snapshot is read-only **by project convention**: treat `reference/` as immutable. Do not inject bugs into or rewrite those source files. Future challenges should be built as derived copies or applied patches outside `reference/`.

A separately named Git branch, `reference-baseline-2026-10-21`, records this exact snapshot. A Git commit SHA is the authoritative permanent checksum of the archive state. This rule does not itself enforce GitHub branch-protection permissions.

## How to check out the complete original archive

```bash
git clone https://github.com/sabareeshrao/Bug-Fix.git
cd Bug-Fix
```

The `reference/shopizer/` directory contains ordinary copied source files, not a Git submodule. The source is already included in the clone or GitHub ZIP archive.
