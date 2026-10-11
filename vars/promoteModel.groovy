def call(String name, String fromAlias, String toAlias) {
    sh """
        . .venv/bin/activate
        python src/promote.py --name ${name} --from-alias ${fromAlias} --to-alias ${toAlias}
    """
}
