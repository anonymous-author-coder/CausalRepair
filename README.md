# CausalRepair: Bridging the Causality Gap in LLM-based APR via Dual-Slicing

CausalRepair is a novel Automated Program Repair (APR) framework designed to bridge the "causality gap" in Large Language Model (LLM)-based repair. By leveraging a synergistic dual-slicing strategy, the framework constructs a Minimal Causal Context that eliminates noise from unexecuted code and resolves test context ambiguity.

## Overview
Existing LLM-based APR approaches often suffer from either noise interference in full test functions or the absence of critical dependencies when providing only failing lines. CausalRepair addresses these limitations through three core phases:

- Constructing Minimal Causal Context: Employs context-aware static slicing on the test side and execution-trace-based dynamic slicing (via Slicer4J) on the source side to isolate bug-related dependencies.

- Conversation-driven Iterative Repair: Utilizes a "generate-validate-feedback" loop where LLMs refine patches based on real-time execution diagnostics.

- Patch Augmentation: Generates diverse variations of plausible patches to mitigate test suite overfitting and increase the likelihood of semantic correctness.

## Environment Setup

### 1. Prerequisites

- JDK 1.8: Required for Defects4J compatibility.

```
JDK 1.8 for Defects4J
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

- Defects4J: Ensure Defects4J is installed and the framework binaries are added to your PATH.

```
Install Defects4J from https://github.com/rjust/defects4j 
export PATH=$PATH:"path2defects4j"/framework/bin
```


- Python 3.8+: Recommended for running the repair scripts.


### 2. API Configuration
Configure your API keys in utils/api_request.py. The framework supports SiliconFlow, OpenAI, and Zhipu AI.


## Project Structure

