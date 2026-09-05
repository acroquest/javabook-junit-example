# javabook-junit-example

『Java本格入門』Chapter 13「JUnitで品質を保証する」で使うJUnitとJenkinsのサンプルプロジェクトです。

## 版とタグの対応

| 版 | タグ | 前提環境 |
| --- | --- | --- |
| 第1版 | `java8` | Java 8 / Maven 3 / JUnit 4 |
| 第2版（Java 25対応） | `java25` | Java 25 / Maven 3.9 / JUnit 6 / Jenkins LTS 2.568.1 |

お読みの版に対応するタグをチェックアウトしてください。

```
git clone https://github.com/acroquest/javabook-junit-example.git
cd javabook-junit-example
git checkout java25
```

## 使い方（第2版）

| コマンド | 内容 |
| --- | --- |
| `mvn test` | JUnitテストを実行する |
| `mvn clean verify site` | テストを実行し、Checkstyle・SpotBugs・JaCoCo・テスト結果のレポートをtargetに出力する（Jenkinsfileと同じ手順） |

Jenkinsでは、このリポジトリを「Pipeline script from SCM」で指定すると、`Jenkinsfile` に書かれた手順でビルドとレポートの取り込みが実行されます。
