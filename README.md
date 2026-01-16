# CausalRepair: Bridging the Causality Gap in LLM-based APR via Dual-Slicing

CausalRepair is a novel Automated Program Repair (APR) framework designed to bridge the "causality gap" in Large Language Model (LLM)-based repair. By leveraging a synergistic dual-slicing strategy, the framework constructs a Minimal Causal Context that eliminates noise from unexecuted code and resolves test context ambiguity.

## Overview
Existing LLM-based APR approaches often suffer from either noise interference in full test functions or the absence of critical dependencies when providing only failing lines. CausalRepair addresses these limitations through three core phases:

- Constructing Minimal Causal Context: Employs context-aware static slicing on the test side and execution-trace-based dynamic slicing (via Slicer4J) on the source side to isolate bug-related dependencies.

- Conversation-driven Iterative Repair: Utilizes a "generate-validate-feedback" loop where LLMs refine patches based on real-time execution diagnostics.

- Patch Augmentation: Generates diverse variations of plausible patches to mitigate test suite overfitting and increase the likelihood of semantic correctness.
